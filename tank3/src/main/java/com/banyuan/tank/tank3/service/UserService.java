package com.banyuan.tank.tank3.service;


import com.banyuan.tank.tank3.domain.User;
import com.banyuan.tank.tank3.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author CXY
 * @date 2019-11-04 20:51
 * 描述信息：
 */
@Service
@EnableTransactionManagement
public class UserService {
    @Autowired
    UserMapper mapper;
    /**
     *添加操作
     */
    @RequestMapping(value = "insertUser")
     public void insertUser(String name,String link,String begin,String end,String desc,String achievement) throws Exception {
//        SqlSession session = baseDB.getSession();
//        mapper = session.getMapper(UserMapper.class);
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date beginTime =format.parse(begin);
        DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        Date endTime =format.parse(end);

        User user = new User(name,link,beginTime,endTime,desc,achievement,1,0001);
        try {
            mapper.insertUser(user);
            System.out.println(user.toString());
//            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
//            session.rollback();
        }
    }

    /**
     * 删除操作
     */
    @RequestMapping(value = "deleteUser")
     public void deleteUser() throws Exception {
//        SqlSession session=baseDB.getSession();
//        mapper=session.getMapper(UserMapper.class);
        try {
            mapper.deleteUser(5);
//            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
//            session.rollback();
        }
    }

    /**
     *改
     */
    public void updateUser(Integer id,User user) throws Exception {
//        SqlSession session=baseDB.getSession();
//        mapper=session.getMapper(UserMapper.class);
        try {
            mapper.updateUser(user,id);
//            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
//            session.rollback();
        }
    }

    /**
     * 根据ID查询
     */
    public void selectUserById(Integer id) throws Exception {
//        SqlSession session=baseDB.getSession();
//        mapper=session.getMapper(UserMapper.class);
        try {
            //这里用到User类的无参构造方法创建对象，User user=new User（）；
            User user =mapper.selectUserById(id);
            System.out.println(user);

//            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
//            session.rollback();
        }
    }


    /**
     *查询所有
     */

    public void selectAllUser() throws Exception {
//        SqlSession session = baseDB.getSession();
//        mapper = session.getMapper(UserMapper.class);
        try {
            List<User> user = mapper.selectAllUser();
            System.out.println(user.toString());
//            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
//            session.rollback();
        }


    }


}
