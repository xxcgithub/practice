package com.example.xxczijidajianxiangmu.http;

import org.junit.Test;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/17
 * Time: 11:54
 */
public class HttpTest {
    @Test
    public void getMess (HttpServletRequest request, HttpServletResponse response){
        String cookie = request.getHeader("cookie");
        Enumeration<String> headers = request.getHeaders("user-Agent");
        Enumeration<String> headerNames = request.getHeaderNames();
        Cookie[] cookies = request.getCookies();
        String pathInfo = request.getPathInfo();
        String remoteUser = request.getRemoteUser();
        StringBuffer requestURL = request.getRequestURL();
        String requestURI = request.getRequestURI();
        String remoteAddr = request.getRemoteAddr();


    }
}
