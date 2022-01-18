package com.gaocai.servlet;

import com.gaocai.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "Servlet", value = "/Servlet3")
public class Servlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入到servlet03");
        Student s = new Student("A001","zs",23);
        Student s2 = new Student("A002","lisi",230);
//        {"id":"?","name":"?","age":"?"}
//        {"s1":{"id":"?","name":"?","age":"?"},"s2":{"id":"?","name":"?","age":"?"}}
        String str = "{\"s1\":{\"id\":\""+s.getId()+"\",\"name\":\""+s.getName()+"\",\"age\":\""+s.getAge()+"\"},\"s2\":{\"id\":\""+s2.getId()+"\",\"name\":\""+s2.getName()+"\",\"age\":\""+s2.getAge()+"\"}}";

        PrintWriter out = response.getWriter();
        out.print(str);
//        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
