package com.gaocai.test;

import com.gaocai.domain.Student;
import com.gaocai.service.StudentService;
import com.gaocai.service.impl.StudentServiceImpl;
import com.gaocai.util.ServiceFactory;

import java.util.List;


public class Test1 {
    public static void main(String[] args) {
//        StudentService ss = new StudentServiceImpl();
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());
        //测试插入
//        Student s = new Student();
//        s.setId("A0006");
//        s.setName("cxk");
//        s.setAge(34);
//
//        ss.save(s);

        //测试查单条
//        Student s = ss.getById("A0005");
//        System.out.println(s);
        //查所有
        List<Student> sList = ss.getAll();
        for(Student s:sList){
            System.out.println(s);
        }
    }
}
