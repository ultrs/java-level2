package com.mentoring.level2.collectionHomework.part2;
/*
- Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 */

public class Movie {
    private int id;
    private int publicationYear;
    private int publicationMonth;
    private String genre;
    private double rating;

    public Movie(int id, int publicationYear, int publicationMonth, String genre, double rating) {
        this.id = id;
        this.publicationYear = publicationYear;
        this.publicationMonth = publicationMonth;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPublicationMonth() {
        return publicationMonth;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", publicationYear=" + publicationYear +
                ", publicationMonth=" + publicationMonth +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
