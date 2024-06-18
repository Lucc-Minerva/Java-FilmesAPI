package main.java.br.com.movieapi.api;

import java.net.http.HttpRequest;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ApiMovieApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

        String apiKey = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIyZDVmNjc2ZWI2MmVhMzI4ODZhZGMzYjJiNzZlMTc3MyIsInN1YiI6IjY2NzA5YjMyZjk4NGRlZjhiN2MzNWEzYSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.sPZf6AUvWGIaCueAzD0vqBWrgWt4FepYYxUcvJeq7DM";

        HttpRequest request = HttpRequest
        .newBuilder()
        .uri(URI.create("https://api.themoviedb.org/3/movie/top_rated?language=en-US&page=1"))
        .header("accept", "application/json")
        .header("Authorization", "Bearer " + apiKey)
        .method("GET", HttpRequest.BodyPublishers.noBody())
        .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        
        System.out.println("Resposta da JSON: " + json);

        // String[] filmesArray = parseJsonFilmes(json);

        // List<String> titulos = parseTitulos(filmesArray);
        // titulos.forEach(System.out::println);

        // List<String> urlImagens = parseImagens(filmesArray);
        // urlImagens.forEach(System.out::println);

        // List<String> rating = parseRating(filmesArray);
        // rating.forEach(System.out::println);

        // List<String> year = parseYear(filmesArray);
        // year.forEach(System.out::println);

    }
}
