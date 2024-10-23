package com.Yt.Search.Engine.POC.model;
import java.util.List;

public class GoogleSearchResponse {

    private List<Item> items;

    // Getters and Setters
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    // Nested class to represent each search result item
    public static class Item {
        private String title;
        private String link;
        private String snippet;
        private String displayLink;


        // Getters and Setters
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {

        }

        public double getRelevanceScore() {
            return 0.0;
        }
    }
}