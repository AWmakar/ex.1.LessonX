package ru.netology.javaqa.movie;

public class PosterManager {

    private Poster[] movies = new Poster[0];
    private int limit;

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addMovies(Poster movie) {
        Poster[] tmp = new Poster[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Poster[] findAll() {
        return movies;
    }

    public Poster[] findLast() {

        int resultLength;
        if (limit <= movies.length) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        Poster[] showLastMovies = new Poster[resultLength];
        for (int i = 0; i < showLastMovies.length; i++) {
            showLastMovies[i] = movies[movies.length -1 - i];
        }
        return showLastMovies;
    }

}