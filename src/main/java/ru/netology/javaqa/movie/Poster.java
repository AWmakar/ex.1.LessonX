package ru.netology.javaqa.movie;
public class Poster {
    private int id;// идентификатор
    private String movie; // название фильма
    private String genre; // жанр фильма
    private int released; // релиз

    public Poster(int id, String movieName, String genreMovie, int released) {
        this.id = id;
        this.movie = movie;
        this.genre = genre;
        this.released = released;
    }
}