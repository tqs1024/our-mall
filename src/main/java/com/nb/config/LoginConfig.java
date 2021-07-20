package com.nb.config;

import com.nb.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author : 谭庆山
 * @Date : 2021/7/20 14:51
 * @Description TODO
 */
@Configuration
public class LoginConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new LoginInterceptor());
        registration.addPathPatterns("/**");
        //需要放出主页，分类页，详情页，注册页，还有登出控制器。
        registration.excludePathPatterns("/login", "/check", "/registerhtml", "/registerCheck", "/register", "/logout",
                "/index", "/home", "/", "/sort/**", "/details", "/**/*.html", "/**/*.js", "/**/*.css", "/**/*.jpg", "/**/*.png",
                "/**/*.eot", "/**/*.svg", "/**/*.ttf", "/**/*.woff", "/**/*.woff2");
    }
}
