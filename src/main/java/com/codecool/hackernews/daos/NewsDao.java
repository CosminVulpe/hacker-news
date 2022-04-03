package com.codecool.hackernews.daos;

import com.codecool.hackernews.models.News;

import java.io.IOException;
import java.util.List;

public interface NewsDao {
    List<News> getAll(int page) throws IOException;
}
