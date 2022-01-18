package com.gaocai.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入到servlet01");
        PrintWriter out = response.getWriter();
//        out.print("1234alsdjflkasdj");
////        out.flush();
//        out.close();

        response.getWriter().print("aklsdjfljasasdklfjklasd"); //响应流会自动关闭
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
