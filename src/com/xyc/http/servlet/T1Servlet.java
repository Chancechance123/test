package com.xyc.http.servlet;/**
 * @author XYC
 * @version 1.0
 * @DAte
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class T1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
        response.sendRedirect("/http/hi.html");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
