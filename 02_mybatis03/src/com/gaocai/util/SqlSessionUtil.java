package com.gaocai.util;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {

    private SqlSessionUtil(){}

    private  static SqlSessionFactory sqlSessionFactory;
    static{
        String resource = "mybatis-config.xml";
        System.out.println("I am resource-------->");
        InputStream inputStream = null;
        try {
            System.out.println("I will start--------------->");
            inputStream = Resources.getResourceAsStream(resource);
            System.out.println("inputStream = "+ inputStream);
            System.out.println("I am ending-------------->");
        } catch (IOException e) {
            System.out.println("I inputStream is error--------------->");
            e.printStackTrace();
        }
        System.out.println("I am sqlSessionFactory ,I will start----------->");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        System.out.println("I am sqlSessionFactory-----------> = "+sqlSessionFactory);
    }
    private static ThreadLocal<SqlSession> t = new ThreadLocal<SqlSession>();

    //取得SqlSession对象
    public static SqlSession getSession(){
        System.out.println("I am get Session-----------------");
        SqlSession session = t.get();
        if(session == null){
            session = sqlSessionFactory.openSession();
            t.set(session);
        }
        return session;
    }
    public static void myClose(SqlSession session){
        if(session != null){
            session.close();
            t.remove();
        }
    }
}
