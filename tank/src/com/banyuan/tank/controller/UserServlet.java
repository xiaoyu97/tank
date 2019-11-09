package com.banyuan.tank.controller;

import com.banyuan.tank.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author CXY
 * @date 2019-11-05 13:55
 * 描述信息：
 */
@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
super.doPost(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request,response);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");

        String name=req.getParameter("name");
        String link=req.getParameter("link");
        String begin=req.getParameter("begin");
        String end=req.getParameter("end");
        String desc=req.getParameter("desc");
        String achievement=req.getParameter("achievement");

        UserService userService=new UserService();
        try {
            userService.insertUser(name,link,begin,end,desc,achievement);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(name);
        System.out.println(link);
        System.out.println(begin);
        System.out.println(end);
        System.out.println(achievement);
        System.out.println(desc);


    }

}
