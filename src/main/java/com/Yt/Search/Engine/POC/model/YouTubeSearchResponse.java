package com.Yt.Search.Engine.POC.model;

import java.util.List;

public class YouTubeSearchResponse {
    private String kind;
    private String etag;
    private PageInfo pageInfo;
    private List<YouTubeSearchResultItem> items;

    public YouTubeSearchResponse() {}

    public YouTubeSearchResponse(String kind, String etag, PageInfo pageInfo, List<YouTubeSearchResultItem> items) {
        this.kind = kind;
        this.etag = etag;
        this.pageInfo = pageInfo;
        this.items = items;
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

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<YouTubeSearchResultItem> getItems() {
        return items;
    }

    public void setItems(List<YouTubeSearchResultItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "YouTubeSearchResponse{" +
                "kind='" + kind + '\'' +
                ", etag='" + etag + '\'' +
                ", pageInfo=" + pageInfo +
                ", items=" + items +
                '}';
    }

    // Inner classes to represent nested objects in the YouTube API response
    public static class PageInfo {
        private int totalResults;
        private int resultsPerPage;

        public PageInfo() {}

        public PageInfo(int totalResults, int resultsPerPage) {
            this.totalResults = totalResults;
            this.resultsPerPage = resultsPerPage;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public int getResultsPerPage() {
            return resultsPerPage;
        }

        public void setResultsPerPage(int resultsPerPage) {
            this.resultsPerPage = resultsPerPage;
        }

        @Override
        public String toString() {
            return "PageInfo{" +
                    "totalResults=" + totalResults +
                    ", resultsPerPage=" + resultsPerPage +
                    '}';
        }
    }
}
