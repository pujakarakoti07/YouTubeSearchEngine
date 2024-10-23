package com.Yt.Search.Engine.POC.service;
import com.Yt.Search.Engine.POC.model.YouTubeSearchResponse;
import com.Yt.Search.Engine.POC.model.YouTubeVideoResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.Yt.Search.Engine.POC.model.SearchResult;
import java.util.ArrayList;
import java.util.List;
@Service
public class YouTubeAPiService {
    private final String apiKey = "Your API KEY";
    private final String searchUrl = "https://www.googleapis.com/youtube/v3/search";
    private final String videoDetailsUrl = "https://www.googleapis.com/youtube/v3/videos";

    public List<SearchResult> searchYouTube(String searchTerm) {
        RestTemplate restTemplate = new RestTemplate();

        // Build URL for search query
        String url = UriComponentsBuilder.fromHttpUrl(searchUrl)
                .queryParam("part", "snippet")
                .queryParam("q", searchTerm)
                .queryParam("type", "video")
                .queryParam("key", apiKey)
                .toUriString();

        // Make the request and parse response
        YouTubeSearchResponse response = restTemplate.getForObject(url, YouTubeSearchResponse.class);

        // Prepare the list of SearchResults
        List<SearchResult> searchResults = new ArrayList<>();
        if (response != null && response.getItems() != null) {
            response.getItems().forEach(item -> {
                // Fetch video statistics (likes, views)
                SearchResult result = new SearchResult();
                result.setTitle(item.getSnippet().getTitle());
                result.setUrl("https://www.youtube.com/watch?v=" + item.getId().getVideoId());

                // Fetch views and likes for the video
                int views = Integer.parseInt(fetchVideoStatistics(item.getId().getVideoId()));
                result.setViews(views);
                result.setLikes(100); // Stubbed: Replace with actual API call to get likes

                searchResults.add(result);
            });
        }

        return searchResults;
    }

    private String fetchVideoStatistics(String videoId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = UriComponentsBuilder.fromHttpUrl(videoDetailsUrl)
                .queryParam("part", "statistics")
                .queryParam("id", videoId)
                .queryParam("key", apiKey)
                .toUriString();

        // Fetch video statistics
        YouTubeVideoResponse videoResponse = restTemplate.getForObject(url, YouTubeVideoResponse.class);
        if (videoResponse != null && videoResponse.getItems() != null && !videoResponse.getItems().isEmpty()) {
            return videoResponse.getItems().get(0).getStatistics().getViewCount();
        }

        return null;
    }
}
