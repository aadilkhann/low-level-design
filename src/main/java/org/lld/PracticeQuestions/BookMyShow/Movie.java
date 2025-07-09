package org.lld.PracticeQuestions.BookMyShow;

import java.util.ArrayList;
import java.util.UUID;

public class Movie {
    UUID uuid;
    String title;
    String description;
    String language;

    public Movie(UUID uuid, String title, String description, String language) {
        this.uuid = uuid;
        this.title = title;
        this.description = description;
        this.language = language;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
