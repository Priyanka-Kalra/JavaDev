package com.Priyanka;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {

        System.out.println("In Service");

        res.setContentType("text/html");

//        res.getWriter().println("Hoii");

        PrintWriter out=res.getWriter();
        out.println("<h1><b>Hoi<b><h1>");
    }
}
