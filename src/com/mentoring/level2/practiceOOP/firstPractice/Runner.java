package com.mentoring.level2.practiceOOP.firstPractice;
/*
Внимание. При выполнении задания держите в уме принцип инкапсуляции.

//Создать класс Point, описывающий точку в двумерных координатах.
//Полями этого класса должны быть координаты x и y.
//Класс должен иметь один конструктор, принимающий координаты x и y.

//Добавьте функционал для получения скрытой информации (координаты точки), а получить её можно только с помощью методов доступа (get/set).
Создать метод distance, принимающий объект Point и определяющий расстояние до неё.
Используя класс точки, создать класс Rectangle, описывающий прямоугольник.
В нём хранятся два поля типа Point - координаты левого верхнего и правого нижнего угла.

Создать следующие методы в классе Rectangle:
- Высчитывающий площадь прямоугольника
- Высчитывающий длину диагонали
Написать тестовый класс с методом main программу, демонстрирующим создание объекта класса Rectangle и применение вышеперечисленных методов.
 */

import com.mentoring.level2.practiceOOP.firstPractice.figure.Point;
import com.mentoring.level2.practiceOOP.firstPractice.figure.Rectangle;

public class Runner {

    public static void main(String[] args) {
        Point point1 = new Point(1, 6);
        Point point2 = new Point(5, 2);
        System.out.println("Distance: " + point1.distance(point2));

        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println("Diagonal: " + rectangle.diagonalLength());
        System.out.println("Area: " + rectangle.rectangleArea());
    }

}
