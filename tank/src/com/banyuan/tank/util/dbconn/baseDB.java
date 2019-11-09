package com.banyuan.tank.util.dbconn;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * @author CXY
 * @date 2019-11-04 20:49
 * 描述信息：数据库连接
 */
public class baseDB {
    public static SqlSessionFactory sessionFactory;

    static{
        try {
            //使用MyBatis提供的Resources类加载mybatis的配置文件
            Reader reader = Resources.getResourceAsReader("mybatis/mybatis.cfg.xml");
            //构建sqlSession的工厂

            sessionFactory = new SqlSessionFactoryBuilder().build(reader);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /**
     * 创建能执行映射文件中sql的sqlSession
     */
    public static SqlSession getSession(){
        return sessionFactory.openSession();
    }
}
