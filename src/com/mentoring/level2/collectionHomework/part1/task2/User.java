package com.mentoring.level2.collectionHomework.part1.task2;
/*
Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список объектов
типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 */
public class User {

    public static final int AGE_LIMIT = 18;

    private int id;
    private String userName;
    private int age;

    public User(int id, String userName, int age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

}
