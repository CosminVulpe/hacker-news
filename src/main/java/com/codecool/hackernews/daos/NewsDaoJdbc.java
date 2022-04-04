package com.codecool.hackernews.daos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;

import com.codecool.hackernews.models.News;
import com.codecool.hackernews.serialization.NewsSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


public class NewsDaoJdbc implements NewsDao {
    private final String typeOfNews;

    public NewsDaoJdbc(String typeOfNews) {
        this.typeOfNews = typeOfNews;
    }


    @Override
    public List<News> getAll(int page) throws IOException {
        Gson gsonBuilder = new GsonBuilder().registerTypeAdapter(News.class, new NewsSerializer()).create();
        String newsJSONFormat = getExternalAPI(page);
        Type newsList = new TypeToken<List<News>>() {
        }.getType();
        return gsonBuilder.fromJson(newsJSONFormat, newsList);
    }


    public String getExternalAPI(int page) throws IOException {
        String externalUrl = "https://api.hnpwa.com/v0/";
        StringBuilder sb = new StringBuilder();
        java.net.URL url = new java.net.URL(externalUrl + typeOfNews + "/" + page + ".json");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            sb.append(inputLine);
        }
        in.close();
        connection.disconnect();
        return sb.toString();
    }

}
