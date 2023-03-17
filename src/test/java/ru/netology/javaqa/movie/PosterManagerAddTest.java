package ru.netology.javaqa.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerAddTest {

    Poster movie1 = new Poster(1, "film1", "drama", 2001);
    Poster movie2 = new Poster(2, "film2", "comedy", 2008);
    Poster movie3 = new Poster(3, "film3", "romance", 1999);
    Poster movie4 = new Poster(4, "film4", "detective", 2010);
    Poster movie5 = new Poster(5, "film5", "action", 2007);
    Poster movie6 = new Poster(6, "film6", "horror", 2000);
    Poster movie7 = new Poster(7, "film7", "animated", 1988);
    Poster movie8 = new Poster(8, "film8", "disaster", 2016);
    Poster movie9 = new Poster(9, "film9", "science", 2020);
    Poster movie10 = new Poster(10, "film10", "fantasy", 2001);


    @Test
    public void shouldAddSomeMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovies(movie1);
        manager.addMovies(movie2);
        manager.addMovies(movie3);

        Poster[] expected = {movie1, movie2, movie3};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovies(movie7);

        Poster[] expected = {movie7};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddEmptyMovies() {
        PosterManager manager = new PosterManager();

        Poster[] expected = {};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowLastMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovies(movie1);
        manager.addMovies(movie2);
        manager.addMovies(movie3);


        Poster[] expected = {movie3, movie2, movie1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastMoviesLimitAbove() {
        PosterManager manager = new PosterManager();

        manager.addMovies(movie1);
        manager.addMovies(movie2);
        manager.addMovies(movie3);
        manager.addMovies(movie4);
        manager.addMovies(movie5);
        manager.addMovies(movie6);
        manager.addMovies(movie7);
        manager.addMovies(movie8);


        Poster[] expected = {movie8, movie7, movie6, movie5, movie4};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastMoviesLimit () {
        PosterManager manager = new PosterManager();

        manager.addMovies(movie1);
        manager.addMovies(movie2);
        manager.addMovies(movie3);
        manager.addMovies(movie4);
        manager.addMovies(movie5);

        Poster[] expected = {movie5, movie4, movie3, movie2, movie1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowLastMoviesLimitKit () {
        PosterManager manager = new PosterManager(9);

        manager.addMovies(movie1);
        manager.addMovies(movie2);
        manager.addMovies(movie3);
        manager.addMovies(movie4);
        manager.addMovies(movie5);
        manager.addMovies(movie6);
        manager.addMovies(movie7);
        manager.addMovies(movie8);
        manager.addMovies(movie9);
        manager.addMovies(movie10);

        Poster[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastMoviesBellowLimitKit () {
        PosterManager manager = new PosterManager(7);

        manager.addMovies(movie1);
        manager.addMovies(movie2);

        Poster[] expected = {movie2, movie1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}