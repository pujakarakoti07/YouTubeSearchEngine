package com.Yt.Search.Engine.POC.service;


import com.Yt.Search.Engine.POC.model.GoogleSearchResponse;
import com.Yt.Search.Engine.POC.model.SearchResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoogleSearchAPIService {

    private final String apiKey = "YOUR_GOOGLE_API_KEY";
    private final String searchEngineId = "YOUR_SEARCH_ENGINE_ID";
    private final String searchUrl = "https://www.googleapis.com/customsearch/v1";

    public List<SearchResult> searchGoogle(String searchTerm) {
        RestTemplate restTemplate = new RestTemplate();

        // Build URL for search query
        String url = UriComponentsBuilder.fromHttpUrl(searchUrl)
                .queryParam("q", searchTerm)
                .queryParam("key", apiKey)
                .queryParam("cx", searchEngineId)
                .toUriString();

        // Make the request and parse response
        GoogleSearchResponse response = restTemplate.getForObject(url, GoogleSearchResponse.class);

        // Prepare the list of SearchResults
        List<SearchResult> searchResults = new ArrayList<>();
        if (response != null && response.getItems() != null) {
            response.getItems().forEach(item -> {
                SearchResult result = new SearchResult();
                result.setTitle(item.getTitle());
                result.setUrl(item.getLink());
                result.setRelevanceScore(item.getRelevanceScore());  // Replace with appropriate logic
                result.setPlatform("Article/Blog");

                searchResults.add(result);
            });
        }

        return searchResults;
    }
}

