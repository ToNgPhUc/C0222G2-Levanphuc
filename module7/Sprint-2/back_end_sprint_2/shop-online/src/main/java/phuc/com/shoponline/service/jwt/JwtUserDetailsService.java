package phuc.com.shoponline.service.jwt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import phuc.com.shoponline.model.account.AppUser;
import phuc.com.shoponline.model.account.UserRole;
import phuc.com.shoponline.repository.IAppUserRepository;
import phuc.com.shoponline.repository.IUserRoleRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private IAppUserRepository IAppUserRepository;

    @Autowired
    private IUserRoleRepository IUserRoleRepository;

    /**
     *
     * @creator PhucLV
     * @date-create 9/8/2022
     * @param userName
     * @return username, password, roles list
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        AppUser appUser = this.IAppUserRepository.findAppUserByUserName(userName);

        if (appUser == null) {
            return null;
        }

        // [ROLE_USER, ROLE_ADMIN,..]
        List<UserRole> userRoles = this.IUserRoleRepository.findAllByAppUser(appUser);

        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        if (userRoles != null) {
            for (UserRole userRole : userRoles) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getAppRole().getRoleName());
                grantList.add(authority);
            }
        }

        return new User(appUser.getUserName(),
                appUser.getPassword(), grantList);
    }
}