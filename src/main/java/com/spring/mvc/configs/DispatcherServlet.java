package com.spring.mvc.configs;

import com.spring.mvc.interceptors.EmployeeInterceptor;
import com.spring.mvc.interceptors.GenericInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan(value = "com.spring.mvc")
public class DispatcherServlet implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new GenericInterceptor()).order(1).addPathPatterns("/employee/**");
        registry.addInterceptor(new EmployeeInterceptor()).order(2);
    }
}
