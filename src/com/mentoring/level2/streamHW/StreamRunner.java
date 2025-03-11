package com.mentoring.level2.streamHW;

import com.mentoring.level2.streamHW.statistic.StatisticMap;
import com.mentoring.level2.streamHW.student.Assessment;
import com.mentoring.level2.streamHW.student.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:

//Средняя оценка студентов этого курса, количество оценок у которых больше 3-х

//Список студентов данного курса, но только с полями Имя и Фамилия.
//Список должен быть отсортированы по этим двум полям

//Объект с двумя полями:
//- Отсортированный список студентов с пункта 2
//- Средняя оценка этих студентов

Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */
public class StreamRunner {

    public static void main(String[] args) {

        List<Student> studentList= List.of(
                new Student("Dima", "Dmitriev", 2,
                        List.of(new Assessment("Math", 5),
                                new Assessment("Physics", 4),
                                new Assessment("Psychology", 4),
                                new Assessment("Literature", 5))),
                new Student("Alina", "Alinova", 2,
                        List.of(new Assessment("Math", 5),
                                new Assessment("Physics", 4),
                                new Assessment("Psychology", 3))),
                new Student("Sveta", "Svetikova", 2,
                        List.of(new Assessment("Math", 3),
                                new Assessment("Physics", 4),
                                new Assessment("Psychology", 3),
                                new Assessment("Literature", 3))),
                new Student("Ivan", "Ivanov", 3,
                        List.of(new Assessment("Math", 4),
                                new Assessment("Physics", 5),
                                new Assessment("Psychology", 5),
                                new Assessment("Literature", 5))),
                new Student("Petr", "Petrov", 4,
                        List.of(new Assessment("Math", 5),
                                new Assessment("Physics", 5),
                                new Assessment("Psychology", 3)))
        );

        int entryKey = 2;
        System.out.println(getStatistic(studentList, entryKey));

    }

    public static Map getStatistic(List<Student> studentList, int key) {
        HashMap<Integer, StatisticMap> map = new HashMap<>();
        map.put(key, new StatisticMap(key, studentList));
        return map;
    }
}
