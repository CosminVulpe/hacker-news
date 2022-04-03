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

@WebServlet(name = "topNewsServlet", urlPatterns = {"/api/top"}, loadOnStartup = 1)
public class TopNewsServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        PrintWriter printWriter = resp.getWriter();
        NewsDaoJdbc newsDaoJdbc = new NewsDaoJdbc("news");
        List<News> newsList = newsDaoJdbc.getAll(Integer.parseInt(req.getParameter("page")));
        Gson gson = new GsonBuilder().registerTypeAdapter(News.class, new NewsSerializer()).create();
        printWriter.println(gson.toJson(newsList));
    }
}
