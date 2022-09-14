package phuc.com.shoponline.model.jwt;

import lombok.ToString;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
// đặt tostring ở đây để có thể sout ra được các đối tượng ở trong class này
@ToString
public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    private String username;

    @Size(max = 100)
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",
            message = "Minimum eight characters, at least one letter, one number and one special character")
    private String password;
    private String token;

    @Size(max = 100)
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",
            message = "Minimum eight characters, at least one letter, one number and one special character")
    private String confirmPassword;


    // cần hàm tạo mặc định để phân tích cú pháp JSON
    public JwtRequest() {

    }

    public JwtRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public JwtRequest(String username, String password, String token) {
        this.username = username;
        this.password = password;
        this.token = token;
    }

    public JwtRequest(String username, String password, String token, String confirmPassword) {
        this.username = username;
        this.password = password;
        this.token = token;
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
