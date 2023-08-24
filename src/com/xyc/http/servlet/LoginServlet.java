package com.xyc.http.servlet;
/**
 * @author XYC
 * @version 1.0
 * @DAte
 */


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet()方法被调用~");
        PrintWriter writer = response.getWriter();
        writer.print("<h1>登录成功</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
