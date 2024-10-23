package com.Yt.Search.Engine.POC.model;


public class YouTubeSearchResultItem {
    private String kind;
    private String etag;
    private Id id;
    private Snippet snippet;

    // Constructor, Getters, Setters, toString()

    public YouTubeSearchResultItem() {}

    public YouTubeSearchResultItem(String kind, String etag, Id id, Snippet snippet) {
        this.kind = kind;
        this.etag = etag;
        this.id = id;
        this.snippet = snippet;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    @Override
    public String toString() {
        return "YouTubeSearchResultItem{" +
                "kind='" + kind + '\'' +
                ", etag='" + etag + '\'' +
                ", id=" + id +
                ", snippet=" + snippet +
                '}';
    }

    // Nested classes for the "id" and "snippet" fields of the YouTube API response
    public static class Id {
        private String kind;
        private String videoId;

        public Id() {}

        public Id(String kind, String videoId) {
            this.kind = kind;
            this.videoId = videoId;
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getVideoId() {
            return videoId;
        }

        public void setVideoId(String videoId) {
            this.videoId = videoId;
        }

        @Override
        public String toString() {
            return "Id{" +
                    "kind='" + kind + '\'' +
                    ", videoId='" + videoId + '\'' +
                    '}';
        }
    }

    public static class Snippet {
        private String publishedAt;
        private String channelId;
        private String title;
        private String description;
        private String channelTitle;

        public Snippet() {}

        public Snippet(String publishedAt, String channelId, String title, String description, String channelTitle) {
            this.publishedAt = publishedAt;
            this.channelId = channelId;
            this.title = title;
            this.description = description;
            this.channelTitle = channelTitle;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getChannelTitle() {
            return channelTitle;
        }

        public void setChannelTitle(String channelTitle) {
            this.channelTitle = channelTitle;
        }

        @Override
        public String toString() {
            return "Snippet{" +
                    "publishedAt='" + publishedAt + '\'' +
                    ", channelId='" + channelId + '\'' +
                    ", title='" + title + '\'' +
                    ", description='" + description + '\'' +
                    ", channelTitle='" + channelTitle + '\'' +
                    '}';
        }
    }
}
