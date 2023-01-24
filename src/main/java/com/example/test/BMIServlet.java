package com.example.test;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "BMIServlet", value = "/BMIServlet")
public class BMIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Float height = Float.parseFloat(request.getParameter("height"));
        Float weight = Float.parseFloat(request.getParameter("weight"));
        String result = "Hello " + name + ", your BMI value is " + weight/(height * height);
        OutputStream out = response.getOutputStream();
        out.write(result.getBytes());
    }
}
