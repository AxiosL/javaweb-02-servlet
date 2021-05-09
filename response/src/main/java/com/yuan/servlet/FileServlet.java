package com.yuan.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取文件下载路径
        String realPath = "D:\\Idea\\projects\\javaweb-02-servlet\\response\\target\\classes\\感受宁静.png";//绝对地址
        System.out.println("下载文件的路径为："+realPath);

        //2.下载的文件名
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
            //最后一个“/”的后一个字符，常用！！！

        //3.设置想办法让浏览器支持（"Content-Disposition"）要下载的东西
            //"Content-Disposition"是下载文件头，"attachment:filename="也重要
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"utf-8"));//注意分号,并转码

        //4.获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);

        //5.创建缓冲区
        int len=0;
        byte[] buffer = new byte[1024];

        //6.获取OutputStream对象
        ServletOutputStream out = resp.getOutputStream();//不太能处理中文

        //7.将FileOutputStream流写入buffer缓冲区,使用OutputStream将缓冲区中的数据输出到客户端
        while ((len=in.read(buffer))>0){
            out.write(buffer,0,len);//从第0个到第len个

        }

        //8.关闭流

        in.close();
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
