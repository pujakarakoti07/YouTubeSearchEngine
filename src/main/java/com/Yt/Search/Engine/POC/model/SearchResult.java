package com.Yt.Search.Engine.POC.model;
public class SearchResult {
    private String title;
    private String url;
    private int views;
    private int likes;
    private double relevanceScore;
    private String platform;

    public SearchResult() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getRelevanceScore() {
        return relevanceScore;
    }

    public void setRelevanceScore(double relevanceScore) {
        this.relevanceScore = relevanceScore;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", views=" + views +
                ", likes=" + likes +
                ", relevanceScore=" + relevanceScore +
                ", platform='" + platform + '\'' +
                '}';
    }

    public SearchResult(String title, String url, int views, int likes, double relevanceScore, String platform) {
        this.title = title;
        this.url = url;
        this.views = views;
        this.likes = likes;
        this.relevanceScore = relevanceScore;
        this.platform = platform;
    }
}
