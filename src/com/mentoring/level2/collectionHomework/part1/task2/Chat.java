package com.mentoring.level2.collectionHomework.part1.task2;

import java.util.ArrayList;

public class Chat {

    private String chatName;
    private ArrayList<User> users;

    public Chat(String chatName, ArrayList<User> users) {
        this.chatName = chatName;
        this.users = users;
    }

    public String getChatName() {
        return chatName;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatName='" + chatName + '\'' +
                ", users=" + users +
                '}';
    }
}
