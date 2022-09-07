package phuc.com.shoponline.util;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
public class JwtTokenUtil implements Serializable {

    private static final long serialVersionUID = -2550185165626007488L;

    public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;

    @Value("${jwt.secret}")
    private String secret;

    /**
     * @creator: PhuongTD
     * @param token
     * @return
     */
    //lấy tên người dùng từ mã thông báo jwt
    public String getUsernameFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    }

    /**
     * @creator: PhucLV
     * @param token
     * @return
     */
    //lấy ngày hết hạn từ mã thông báo jwt
    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    /**
     * @creator: PhucLV
     * @param token
     * @param claimsResolver
     * @param <T>
     * @return
     */
    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    /**
     * @creator: PhuongTD
     * @param token
     * @return
     */
    //để lấy bất kỳ thông tin nào từ mã thông báo, chúng tôi sẽ cần khóa bí mật
    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }

    /**
     * @creator: PhucLV
     * @param token
     * @return
     */
    //kiểm tra xem mã thông báo đã hết hạn chưa
    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    /**
     * @creator: PhucLV
     * @param userDetails
     * @return
     */
    //tạo mã thông báo cho người dùng
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, userDetails.getUsername());
    }

    /**
     * @creator: PhucLV
     * @param username
     * @return
     */
    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, username);
    }

    /**
     * @creator: PhucLV
     * @param claims
     * @param subject
     * @return
     */

// trong khi tạo mã thông báo -
    // 1. Xác định các xác nhận quyền sở hữu của mã thông báo, như Nhà phát hành, Ngày hết hạn, Chủ đề và ID
    // 2. Ký JWT bằng thuật toán HS512 và khóa bí mật.
    // 3. Theo JWS Compact Serialization (https://tools.ietf.org/html/draft-ietf-jose-json-web-signature-41#section-3.1)
    // nén JWT thành một chuỗi URL an toàn

    private String doGenerateToken(Map<String, Object> claims, String subject) {

        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 10000))
                .signWith(SignatureAlgorithm.HS512, secret).compact();
    }

    /**
     * @creator: PhucLV
     * @param token
     * @param userDetails
     * @return
     */
    //validate token
    public Boolean validateToken(String token, UserDetails userDetails) {
        final String username = getUsernameFromToken(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }
}
