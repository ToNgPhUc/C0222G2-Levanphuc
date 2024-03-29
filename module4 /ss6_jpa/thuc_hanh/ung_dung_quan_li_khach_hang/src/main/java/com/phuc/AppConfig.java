package com.phuc;

//import cg.wbd.grandemonstration.service.CustomerService;
//import cg.wbd.grandemonstration.service.impl.SimpleCustomerServiceImpl;
import com.phuc.repository.ICustomerRepository;
import com.phuc.repository.iplm.CustomerRepositoryIplm;
import com.phuc.service.ICustomerService;
import com.phuc.service.iplm.CustomerServiceIplm;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
@EnableWebMvc
@ComponentScan("com.phuc")
public class AppConfig implements WebMvcConfigurer, ApplicationContextAware {
    private ApplicationContext appContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        appContext = applicationContext;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        return viewResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        return templateEngine;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(appContext);
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        return templateResolver;
    }

// 2 bổ sung thêm 2 bean sau khi l

//    @Bean
//    public ICustomerRepository customerRepository() {
//        return new CustomerRepositoryIplm();
//    }
//
//    @Bean
//    public ICustomerService customerService() {
//        return new CustomerServiceIplm();
//    }

//    @Bean
//    public CustomerService customerService() {
//        return new SimpleCustomerServiceImpl();
//    }
}
