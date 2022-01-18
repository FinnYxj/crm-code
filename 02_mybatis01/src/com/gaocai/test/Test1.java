package com.gaocai.test;

import com.gaocai.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        //输入流
        InputStream inputStream = null;
        try {
            //通过加载mybatis说的主配置文件mybatis-config.xml，创建输入流对象
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        * SqlSessionFactoryBuilder:SqlSessionFactory的创建者
        *   通过该创建者对象调用建造方法，为我们创建一个SqlSessonFactory对象
        *
        * sqlSessionFactory对象的唯一作用就是为我们创建一个SqlSesson对象
        *   我们未来所有的操作，使用的都是SqlSession对象
        * */
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        /*
            我们未来所有的操作，使用的都是session对象
        * */
        SqlSession session = sqlSessionFactory.openSession();

        /*
        * 需求：根据id查
        *   如果获得的是单条记录，我们调用selectOne()方法
        *   参数一：根据命名空间.sqlId的形式找到我们需要使用的sql 语句
        *   参数二：我们要为sql语句中传递的参数
        * */
//        Student s = session.selectOne("test1.getById","A0001");
//        System.out.println(s);
//        session.close();
//        List<Student> sl = session.selectList("test1.getAll");
//        for(Student s:sl){
//            System.out.println(s);
//        }
//        session.close();

        //mybatis默认情况下是手动提交事务
        //添加操作
    /*    Student s = new Student();
        s.setId("A0006");
        s.setAge(33);
        s.setName("cxk");
        int result = session.insert("test1.save",s);
        System.out.println(result);
        session.commit();
        session.close();*/
        //修改操作
        /*Student s = new Student();
        s.setName("cxk1");
        s.setAge(240);
        s.setId("A0006");
        session.update("test1.update",s);
        session.commit();
        session.close();*/
        //删除操作
        session.delete("test1.delete","A0006");
        session.commit();
        session.close();
    }
}
