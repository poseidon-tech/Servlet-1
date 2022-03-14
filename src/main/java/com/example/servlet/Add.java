package com.example.servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "addServlet", value = "/add")
public class Add extends HttpServlet {
    public void init()
    {

        System.out.println("Servlet Life cycle Init method called");

    }
    public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
        int x=Integer.parseInt(req.getParameter("num1"));
        int y= Integer.parseInt(req.getParameter("num2"));
        int k=x+y;

//      PrintWriter out=res.getWriter();
//      out.println("Servlet running service method lifecycle");
//      RequestDispatcher rd=req.getRequestDispatcher("sq");
//      rd.forward(req,res);
//      req.setAttribute("s",k);
//      RequestDispatcher rd=req.getRequestDispatcher("sq");
//      rd.forward(req,res);
//      res.sendRedirect("sq");
//      res.sendRedirect("sq?s="+k);
//      HttpSession session=req.getSession();
//      session.setAttribute("s",k);
//      res.sendRedirect("sq");
      Cookie cookie=new Cookie("k",k+"");
      res.addCookie(cookie);
      res.sendRedirect("sq");


    }

    @Override
    public void destroy() {

        System.out.println("Servlet Life cycle Destroy method called");


    }
}