package main.java.br.com.movieapi.api;

import java.net.http.HttpRequest;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class ApiMovieApplication {
    public static void main(String[] args) throws IOException, InterruptedException {
        
    HttpRequest request = HttpRequest
    .newBuilder()
    .uri(URI.create("https://api.themoviedb.org/3/movie/top_rated?language=en-US&page=1"))
    .header("accept", "application/json")
    .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIyZDVmNjc2ZWI2MmVhMzI4ODZhZGMzYjJiNzZlMTc3MyIsInN1YiI6IjY2NzA5YjMyZjk4NGRlZjhiN2MzNWEzYSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.sPZf6AUvWGIaCueAzD0vqBWrgWt4FepYYxUcvJeq7DM")
    .method("GET", HttpRequest.BodyPublishers.noBody())
    .build();
    HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    
    System.out.println(response.body());
    } 
}
