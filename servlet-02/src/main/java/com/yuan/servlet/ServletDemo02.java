package com.yuan.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();

        System.out.println("进入了ServletDemo02");
        RequestDispatcher requestDispatcher = context.getRequestDispatcher("/gp");//转发给gp的路径
        requestDispatcher.forward(req,resp);//实现请求转发,把gp的页面转发给sd2
        //a找b要数据，b没有就去找c，b找到后把c的数据转发给a
        //合并可得
        //context.getRequestDispatcher("/gp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
