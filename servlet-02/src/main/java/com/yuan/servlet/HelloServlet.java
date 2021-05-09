package com.yuan.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("元宝宝");

        //this.getInitParameter();初始化参数，几乎没用
        //this.getServletConfig();servlet配置
        //this.getServletContext();servlet上下文，连接东西的中间对象，返回一个对象

        ServletContext context = this.getServletContext();//保存一些数据，在不同的servlet之间共享

        String username="元仔";//数据
        context.setAttribute("username",username);//把数据保存在了context中，名字为username。值为username


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
