package com.codecool.hackernews.controllers;

import com.codecool.hackernews.daos.NewsDaoJdbc;
import com.codecool.hackernews.models.News;
import com.codecool.hackernews.serialization.NewsSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "NewestNewsServlet", urlPatterns = {"/api/newest"}, loadOnStartup = 1)
public class NewestNewsServlet extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
        PrintWriter out = response.getWriter();
        NewsDaoJdbc newsDaoJdbc = new NewsDaoJdbc("newest");
        List<News> newsList = newsDaoJdbc.getAll(Integer.parseInt(request.getParameter("page")));
        Gson gson = new GsonBuilder().registerTypeAdapter(News.class, new NewsSerializer()).create();
        out.println(gson.toJson(newsList));
    }
}
