package com.mentoring.level2.collectionHomework.part1.task2;

/*
Задача:
- Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
- С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UserChatRunner {

    public static void main(String[] args) {

        ArrayList<User> list1 = new ArrayList<User>();
        ArrayList<User> list2 = new ArrayList<User>();

        list1.add(new User(1, "Dima", 24));
        list1.add(new User(2, "Alina", 18));
        list1.add(new User(3, "Petr", 16));
        list1.add(new User(4, "Ivan", 35));

        list2.add(new User(5, "Sveta", 17));
        list2.add(new User(6, "Kiril", 43));
        list2.add(new User(7, "Lena", 21));
        list2.add(new User(8, "Lara", 19));
        list2.add(new User(9, "Andrey", 15));

        Chat chat1 = new Chat("Java Chat", list1);
        Chat chat2 = new Chat("Python Chat", list2);

        ArrayList<Chat> chatList = new ArrayList<>();
        chatList.add(chat1);
        chatList.add(chat2);

        //- Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
        ArrayList<User> usersAgeLimitConfirmed = new ArrayList<>();
        for (Iterator<Chat> iterator = chatList.iterator(); iterator.hasNext(); ) {
            Chat next = iterator.next();
            for (Iterator<User> iteratorUser = next.getUsers().iterator(); iteratorUser.hasNext(); ){
                User user = iteratorUser.next();
                if (user.getAge() >= User.AGE_LIMIT) usersAgeLimitConfirmed.add(user); //6
            }
        }

        for (User user : usersAgeLimitConfirmed) {
            System.out.println(user);
        }

        //- С помощью итератора посчитать средний возраст всех оставшихся пользователей
        System.out.println("Средний возраст допущенных пользователей: " + getAvgAge(usersAgeLimitConfirmed));

    }

    public static double getAvgAge(ArrayList<User> users) {
        double sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        return sum / users.size();
    }
}
