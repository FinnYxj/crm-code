package com.gaocai.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "Servlet", value = "/Servlet3")
public class Servlet4 extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("进入到servlet04");
//        Student s = new Student("A001","zs",23);
//
//        String str = "{\"s1\":{\"id\":\""+s.getId()+"\",\"name\":\""+s.getName()+"\",\"age\":\""+s.getAge()+"}";
//
//        PrintWriter out = response.getWriter();
//        out.print(str);
////        out.flush();
//        out.close();
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        System.out.println("=========start to the system123=========");
        String path = request.getServletPath();
        if("/student/save.do".equals(path)){
            save(request,response);
        }
        else if("/student/update.do".equals(path)){
            update(request,response);
        }
        else if("/student/delete.do".equals(path)){
            delete(request,response);
        }
        else if("/student/select.do".equals(path)){
            select(request,response);
        }
    }
    public static void save(HttpServletRequest request,HttpServletResponse response){
        System.out.println("-----------执行添加操作-----------");
    }
    public static void update(HttpServletRequest request,HttpServletResponse response){
        System.out.println("-----------执行修改操作-----------");
    }
    public static void delete(HttpServletRequest request,HttpServletResponse response){
        System.out.println("-----------执行删除操作-----------");
    }
    public static void select(HttpServletRequest request,HttpServletResponse response){
        System.out.println("-----------执行查询操作-----------");
    }
}
