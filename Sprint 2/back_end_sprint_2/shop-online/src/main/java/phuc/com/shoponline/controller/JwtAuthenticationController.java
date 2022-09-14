package phuc.com.shoponline.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import phuc.com.shoponline.model.account.AppUser;
import phuc.com.shoponline.model.jwt.JwtRequest;
import phuc.com.shoponline.model.jwt.JwtResponse;
import phuc.com.shoponline.service.IAppUserService;
import phuc.com.shoponline.service.jwt.JwtUserDetailsService;
import phuc.com.shoponline.util.JwtTokenUtil;
import phuc.com.shoponline.util.LoginUtil;

import javax.validation.Valid;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtUserDetailsService userDetailsService;

    @Autowired
    private IAppUserService appUserService;

    @Autowired
    private LoginUtil loginUtil;

    /**
     * @param authenticationRequest
     * @return: mã thông báo, danh sách vai trò, tên người dùng, trạng thái 200 nếu ĐƯỢC ỦY QUYỀN hoặc trả về trạng thái 401 nếu KHÔNG ĐƯỢC PHÉP
     * @throws Exception
     * @creator: PhucLV
     * @date-create 9/8/2022
     */
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@Valid @RequestBody JwtRequest authenticationRequest,
                                                       BindingResult bindingResult) throws Exception {
        System.out.println(authenticationRequest);
        this.loginUtil.getTokenMap().remove(authenticationRequest.getUsername());
        if (!this.loginUtil.getTokenMap().isEmpty()) {
            if (this.loginUtil.getTokenMap().get(authenticationRequest.getUsername()) != null) {
                return new ResponseEntity<>("isLogin", HttpStatus.UNAUTHORIZED);
            }
        }
        if (authenticationRequest.getUsername() == null || authenticationRequest.getPassword() == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());
        if (userDetails == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        SecurityContextHolder.getContext()
                .setAuthentication(authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword()));

        AppUser appUser = this.appUserService.findAppUserByUserName(authenticationRequest.getUsername());
        Date date = new Date(System.currentTimeMillis());

             //  nếu password được lưu ở database bị hết hạn

//        if (date.toLocalDate().compareTo(appUser.getCreationDate().toLocalDate().plusDays(30)) >= 0) {
//            return new ResponseEntity<>("PasswordExpired", HttpStatus.UNAUTHORIZED);
//        }

        List<String> grantList = userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());
//        hàm này để lấy tokken
        final String token = jwtTokenUtil.generateToken(userDetails);
        System.out.println(token);
        this.loginUtil.getTokenMap().put(userDetails.getUsername(), token);

        return ResponseEntity.ok(new JwtResponse(token, grantList, userDetails.getUsername()));
    }

    /**
     * @param username
     * @param password
     * @throws Exception
     * @creator: PhucLV
     * @date-create 9/8/2022
     */
    private Authentication authenticate(String username, String password) throws Exception {
        try {
            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
