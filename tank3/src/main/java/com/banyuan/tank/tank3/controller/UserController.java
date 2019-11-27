package com.banyuan.tank.tank3.controller;

import com.banyuan.tank.tank3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * @author CXY
 * @date 2019-11-26 20:27
 * 描述信息：
 */

@RestController
//@RequestMapping("/userServlet")
public class UserController {
    @Autowired
    UserService service;

//    @RequestMapping("/insertUser")
//    public String inserUser() throws Exception {
//        service.insertUser("a","a","2019-10-10","2019-10-12","a","a");
//        return "success";
//    }

    @ResponseBody
    @RequestMapping(value = "/insertUser", method = {RequestMethod.POST, RequestMethod.GET})
    public String login(HttpServletRequest request, HttpSession session) throws Exception {
        String name = request.getParameter("name");
        String link = request.getParameter("link");
        String beginTime = request.getParameter("begin_time");
        String endTime = request.getParameter("end_time");
        String txt = request.getParameter("txt");
        String txt1 = request.getParameter("txt1");
        System.out.println(name);

        service.insertUser(name,link,beginTime,endTime,txt,txt1);
        return "success";
    }
}
