package com.mentoring.level2.collectionHomework.part2;
/*
- Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
Добавить функционал в кинотеатр таким образом, чтобы можно было:
- добавлять в него новый фильм
- получить все фильмы по переданному году
- получить все фильмы по переданному году и месяцу
- получить все фильмы по переданному жанру
- получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
Учесть следующее:
- в кинотеатре фильмы должны храниться в порядке их добавления в него
(т.е. предусмотреть порядок значения ассоциативного массива)
- не должен добавляться фильм, если такой уже есть в кинотеатре
 */

import java.util.LinkedHashMap;
import java.util.Map;


public class Cinema {


    LinkedHashMap<Integer, Movie> cinema = new LinkedHashMap<Integer, Movie>();

    public Cinema(LinkedHashMap<Integer, Movie> cinema) {
        this.cinema = cinema;
    }

    public LinkedHashMap<Integer, Movie> getCinema() {
        return cinema;
    }

//    @Override
//    public Object put(Object key, Object value) {
//        return null;
//    }

    @Override
    public String toString() {
        return "Cinema{" +
                "cinema=" + cinema +
                '}';
    }
}
