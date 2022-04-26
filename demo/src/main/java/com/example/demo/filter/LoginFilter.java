package com.example.demo.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class LoginFilter implements Filter {

   private final  String[] INFO = {"/account/register","/account/login","/js","/cs"};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器启动------");
    }

    @Override
    public void doFilter(ServletRequest ruquest, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入拦截器");
        HttpServletRequest req = (HttpServletRequest) ruquest;
        HttpServletResponse rp = (HttpServletResponse) response;

        String uri = req.getRequestURI();
        System.out.println("url--"+req.getRequestURL());
        System.out.println("uri---"+uri);
        System.out.println(checkUri(uri));
        if (checkUri(uri)){
            filterChain.doFilter(req,rp);
            return;
        }else {
            HttpSession session = req.getSession();
            System.out.println(session.getAttribute("account"));
            if (null !=session.getAttribute("account")){
                filterChain.doFilter(req,rp);
                return;
            }else {
                rp.sendRedirect("register");
            }

        }


    }

    public  boolean checkUri(String str){
        for (String r:INFO){
            if(str.startsWith(r)){
                return true;
            }


        }
        return false;
    }

    @Override
    public void destroy() {

    }
}
