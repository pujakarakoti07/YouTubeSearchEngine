package com.Yt.Search.Engine.POC.model;

import java.util.List;

public class YouTubeVideoResponse {

    // This is the list of video items that the API response contains
    private List<Item> items;

    // Getter for items
    public List<Item> getItems() {
        return items;
    }

    // Setter for items
    public void setItems(List<Item> items) {
        this.items = items;
    }

    // Nested Item class representing each video
    public static class Item {
        private String id;
        private Statistics statistics;

        // Getter and Setter for id
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        // Getter and Setter for statistics
        public Statistics getStatistics() {
            return statistics;
        }

        public void setStatistics(Statistics statistics) {
            this.statistics = statistics;
        }
    }

    // Nested Statistics class to hold video statistics like view count
    public static class Statistics {
        private String viewCount;
        private String likeCount;
        private String dislikeCount;
        private String commentCount;

        // Getter and Setter for viewCount
        public String getViewCount() {
            return viewCount;
        }

        public void setViewCount(String viewCount) {
            this.viewCount = viewCount;
        }

        // Getter and Setter for likeCount
        public String getLikeCount() {
            return likeCount;
        }

        public void setLikeCount(String likeCount) {
            this.likeCount = likeCount;
        }

        // Getter and Setter for dislikeCount
        public String getDislikeCount() {
            return dislikeCount;
        }

        public void setDislikeCount(String dislikeCount) {
            this.dislikeCount = dislikeCount;
        }

        // Getter and Setter for commentCount
        public String getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(String commentCount) {
            this.commentCount = commentCount;
        }
    }
}

