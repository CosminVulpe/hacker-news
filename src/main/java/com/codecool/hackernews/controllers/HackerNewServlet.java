package com.codecool.hackernews.controllers;

import com.codecool.hackernews.daos.NewsDaoJdbc;
import com.codecool.hackernews.views.Layout;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "hackerNewsServlet", urlPatterns = {"/"}, loadOnStartup = 1)
public  class HackerNewServlet extends HttpServlet {
    protected int page = -1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String title = "Michael Hackson news";
        Layout layout = new Layout();

        out.println(layout.getHeaderHtml("Hacker News Project"));
        out.println(layout.getNavBarHtml(title));
        out.println(layout.getMainBodyHtml());
        out.println(layout.getFooterHtml());
    }

    protected void processPageParams(HttpServletRequest request) {
        String pageParam = request.getParameter("page");
        if (pageParam != null) {
            try {
                page = Integer.parseInt(pageParam);
                if (page >= 1)
                    page = 1;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Data Type Incorrect");
            }
        }
    }
}
