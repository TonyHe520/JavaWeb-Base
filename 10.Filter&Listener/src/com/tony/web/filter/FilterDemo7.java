package com.tony.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Author: Tony
 * Blog: https://www.acming.net/
 * Date: 2020/8/24 11:24
 */

@WebFilter("/*")
public class FilterDemo7 implements Filter {


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterDemo7执行了");

        chain.doFilter(req, resp);

        System.out.println("filterDemo7回来了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {
    }

}
