package com.Yt.Search.Engine.POC.controller;

import com.Yt.Search.Engine.POC.model.SearchResult;
import com.Yt.Search.Engine.POC.service.GoogleSearchAPIService;
import com.Yt.Search.Engine.POC.service.YouTubeAPiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
public class SearchController {

    @Autowired
    private YouTubeAPiService youTubeAPIService;

    @Autowired
    private GoogleSearchAPIService googleSearchAPIService;

    @GetMapping("/search")
    public List<SearchResult> search(@RequestParam String searchTerm) {
        List<SearchResult> results = new ArrayList<>();

        // Fetch YouTube results
        results.addAll(youTubeAPIService.searchYouTube(searchTerm));

        // Fetch Google Search results
        results.addAll(googleSearchAPIService.searchGoogle(searchTerm));

        // Sort by relevance, views, etc.
        results.sort(Comparator.comparingDouble(SearchResult::getRelevanceScore).reversed());

        return results;
    }
}

