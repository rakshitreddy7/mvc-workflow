package com.spring.mvc.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

public class GenericInterceptor implements HandlerInterceptor {

    private final Logger LOG = LoggerFactory.getLogger(GenericInterceptor.class);

    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.info("Inside GenericInterceptor's preHandle()");

        return true;
    }

    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOG.info("Inside GenericInterceptor's postHandle()");
    }

    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LOG.info("Inside GenericInterceptor's afterCompletion()");
    }
}
