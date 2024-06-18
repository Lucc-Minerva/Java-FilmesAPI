package main.java.br.com.movieapi;

import java.util.ArrayList;
import java.util.List;

public class Filmes {

    List<String> titulo;
    List<String> urlImagens;

    public Filmes() {
        this.titulo = new ArrayList<>();
        this.urlImagens = new ArrayList<>();
    }

    public List<String> getTitulo() {
        return titulo;
    }

    public void setTitulo(List<String> titulo) {
        this.titulo = titulo;
    }

    public List<String> getUrlImagens() {
        return urlImagens;
    }

    public void setUrlImagens(List<String> urlImagens) {
        this.urlImagens = urlImagens;
    }

}
