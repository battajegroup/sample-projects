package com.sample.filter;



import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.*;  
  
public class MyFilter2 implements Filter{  
  
public void init(FilterConfig arg0) throws ServletException {}  
      
public void doFilter(ServletRequest req, ServletResponse resp,  
    FilterChain chain) throws IOException, ServletException {  
          
    PrintWriter out=resp.getWriter();  
    
    out.append("<h3>");
    out.println("filter2 is invoked before the servlet reached ");  
    out.append("</h3>");            
    chain.doFilter(req, resp);//sends request to next filter/resource  
   
    out.append("<h3>"); 
    out.println("filter2 is invoked after the servlet is executed ");  
    out.append("</h3>");
    out.println();
    }  
    public void destroy() {}  
}  