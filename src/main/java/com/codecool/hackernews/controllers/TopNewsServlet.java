package com.codecool.hackernews.controllers;

import com.codecool.hackernews.daos.NewsDaoJdbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "topNewsServlet", urlPatterns = {"/api/top"}, loadOnStartup = 1)
public class TopNewsServlet extends javax.servlet.http.HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        PrintWriter printWriter = resp.getWriter();
        NewsDaoJdbc newsDaoJdbc = new NewsDaoJdbc("news");

    }
}
