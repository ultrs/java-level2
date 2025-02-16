package com.mentoring.level2.lesson7;
/*
1. Создать класс, описывающий промежуток времени.
   Сам промежуток времени должен задаваться тремя свойствами:
   секундами, минутами и часами.
   Создать метод для получения полного количества секунд в объекте
   Создать два конструктора: первый принимает общее количество
   секунд, второй - часы, минуты и секунды по отдельности.
   Создать метод для вывода данных.
 */

public class Lesson7Runner {

    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(1, 2, 30);
        timeInterval.print();
        System.out.println(timeInterval.totalSeconds());

        TimeInterval timeInterval2 = new TimeInterval(timeInterval.totalSeconds());
        timeInterval2.print();
        TimeInterval sum = timeInterval.plus(timeInterval);
        sum.print();

    }

}
