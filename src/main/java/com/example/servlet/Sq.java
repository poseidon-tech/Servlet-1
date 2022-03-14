package com.example.servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet(name = "sqservlet", value = "/sq")
public class Sq extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse rep) throws IOException {
//       PrintWriter out=rep.getWriter();
//       out.println("sq servlet called");
//       int k= (int) req.getAttribute("s");
//       int k=Integer.parseInt(req.getParameter("s"));
//       HttpSession session=req.getSession();
//       int k= (int) session.getAttribute("s");
//       session.removeAttribute("s");
        int k=0;
        Cookie cookie[]= req.getCookies();
        for (Cookie c:cookie)
        {
        if(c.getName().equals("k"))
        {
            k=Integer.parseInt(c.getValue());
        }
        }

        PrintWriter out=rep.getWriter();
        out.println("Result is :"+k*k);






    }





}
