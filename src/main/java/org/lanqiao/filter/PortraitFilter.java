package org.lanqiao.filter; /**
 * @author:李克强
 * @description:
 * @date:Created in 16:52 2021/1/9
 * @modified by:
 */

import javax.servlet.*;
import javax.servlet.Filter;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = {"*.do","*.jsp"})
public class PortraitFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpServletResponse response1 = (HttpServletResponse) response;
        if (request1.getRequestURL().indexOf("login") == -1){
            if (request1.getSession().getAttribute("admin")==null){
                response1.sendRedirect(request1.getContextPath()+"/view/login.jsp");
            }
        }
        chain.doFilter(request, response);
    }
}
