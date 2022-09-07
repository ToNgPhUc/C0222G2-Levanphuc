package phuc.com.shoponline.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import phuc.com.shoponline.authentication.JwtAuthenticationEntryPoint;
import phuc.com.shoponline.filter.JwtRequestFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    @Autowired
    private UserDetailsService jwtUserDetailsService;

    @Autowired
    private JwtRequestFilter jwtRequestFilter;

    @Autowired
    private AppConfig appConfig;

    /**
     * @param auth
     * @throws Exception
     * @creator: PhucLV
     * @date-create 9/8/2022
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        // cấu hình AuthenticationManager để nó biết tải từ đâu
        // người dùng cho thông tin đăng nhập phù hợp
        // Sử dụng BCryptPasswordEncoder
        auth.userDetailsService(jwtUserDetailsService).passwordEncoder(this.appConfig.passwordEncoder());
    }

    /**
     * @return
     * @throws Exception
     * @creator: PhuongTD
     * @date-create 9/8/2022
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }


    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        //Chúng tôi không cần CSRF cho ví dụ này
        httpSecurity.csrf().disable()

               // không xác thực yêu cầu cụ thể này
                .authorizeRequests().antMatchers(
                        "/authenticate",
                        "/sendSimpleEmail",
                        "/forgotPassword/**",
                        "/findPassword","/**").permitAll().

                //tất cả các yêu cầu khác cần được xác thực

                        anyRequest().authenticated().and().
                // đảm bảo rằng chúng ta sử dụng phiên không trạng thái; phiên sẽ không được sử dụng để
                // lưu trữ trạng thái của người dùng.
                        exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);


        //Thêm bộ lọc để xác thực mã thông báo với mọi yêu cầu
        httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
