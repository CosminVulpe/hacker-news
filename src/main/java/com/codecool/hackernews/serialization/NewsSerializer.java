package com.codecool.hackernews.serialization;

import com.codecool.hackernews.models.News;
import com.google.gson.*;

import java.lang.reflect.Type;

public class NewsSerializer implements JsonSerializer<News>, JsonDeserializer<News> {


    @Override
    public News deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        return new News(
                jsonObject.get("title").getAsString(),
                jsonObject.get("time_ago").getAsString(),
                jsonObject.get("user").isJsonNull()
                        ? "" : jsonObject.get("user").getAsString(),
                jsonObject.get("url").getAsString()
        );
    }

    @Override
    public JsonElement serialize(News news, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("title", news.getTitle());
        jsonObject.addProperty("time_ago", news.getTimeAgo());
        jsonObject.addProperty("user", news.getUser());
        jsonObject.addProperty("url", news.getUrl());
        return jsonObject;
    }
}
