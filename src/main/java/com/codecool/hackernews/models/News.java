package com.codecool.hackernews.models;

public class News {
    private final String title;
    private final String timeAgo;
    private final String user;
    private final String url;

    public News(String title, String timeAgo, String user, String url) {
        this.title = title;
        this.timeAgo = timeAgo;
        this.user = user;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getTimeAgo() {
        return timeAgo;
    }

    public String getUser() {
        return user;
    }

    public String getUrl() {
        return url;
    }
}
