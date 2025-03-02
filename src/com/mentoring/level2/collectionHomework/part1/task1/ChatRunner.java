package com.mentoring.level2.collectionHomework.part1.task1;

import java.util.*;

public class ChatRunner {

    public static void main(String[] args) {

        Chat chat1 = new Chat("Chat1", 650);
        Chat chat2 = new Chat("Chat2", 1212);
        Chat chat3 = new Chat("Chat3", 130);
        Chat chat4 = new Chat("Chat4", 45730);
        Chat chat5 = new Chat("Chat5", 8564);
        Chat chat6 = new Chat("aa", 8564);

        ArrayList<Chat> chatList = new ArrayList<>();
        chatList.add(chat1);
        chatList.add(chat2);
        chatList.add(chat3);
        chatList.add(chat4);
        chatList.add(chat5);
        chatList.add(chat6);

        //- Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
        for (Iterator<Chat> iterator = chatList.iterator(); iterator.hasNext(); ) {
            Chat next = iterator.next();
            if (next.getUsersCount() < Chat.MIN_USERS) iterator.remove();
        }

        for (Chat chat : chatList) {
            System.out.println(chat);
        }
        System.out.println();

        //- Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей,
        // а если это количество совпадает, то по названию в алфавитном порядке.
        chatList.sort(new userCountComparator());

        //- Также предоставить сортировку чатов по названию по умолчанию.
//        Collections.sort(chatList);

        for (Chat chat : chatList) {
            System.out.println(chat);
        }

    }

    public static class userCountComparator implements Comparator<Chat> {
        @Override
        public int compare(Chat o1, Chat o2) {
            if (o1.getUsersCount() == o2.getUsersCount()) {
                return o1.getChatName().compareToIgnoreCase(o2.getChatName());
            } else if (o1.getUsersCount() > o2.getUsersCount()) {
                return -1;
            } else {
                return 1;
            }
        }
    }


}
