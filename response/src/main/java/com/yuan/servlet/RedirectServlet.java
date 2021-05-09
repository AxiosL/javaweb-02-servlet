package com.yuan.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //******************************下面是重点******************************

        /*
        重定向原理
        resp.setHeader("Location","r/i");
        resp.setStatus(302);
        */

        resp.sendRedirect("r/i");//重定向
        /*
        重定向和转发的区别：
        相同点：页面都会实现跳转
        不同点：请求转发时，url不会产生变化
              重定向的时候，url地址栏会变
         */






    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
