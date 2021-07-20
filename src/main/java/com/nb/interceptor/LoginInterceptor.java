package com.nb.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author : 谭庆山
 * @Date : 2021/7/20 14:40
 * @Description 登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Long userId = (Long) request.getSession().getAttribute("userId");
        if (userId != null) {
            return true;
        }
        //返回登录页
        response.sendRedirect(request.getContextPath() + "/login");
        return false;
    }
}
