package com.mentoring.level2.collectionHomework.part2;

import java.util.LinkedHashMap;

public class CinemaRunner {

    public static void main(String[] args) {
        Movie film1 = new Movie(1, 2000, 4, "Drama", 7.4);
        Movie film2 = new Movie(2, 2018, 1, "Drama", 4.5);
        LinkedHashMap<Integer, Movie> movies = new LinkedHashMap<>();
        movies.put(film1.getPublicationYear(), film1);
        movies.put(film2.getPublicationYear(), film2);


    }


}
