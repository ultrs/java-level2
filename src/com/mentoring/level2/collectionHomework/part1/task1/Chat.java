package com.mentoring.level2.collectionHomework.part1.task1;

public class Chat implements Comparable<Chat> {

    public static final int MIN_USERS = 1000;

    private String chatName;
    private int usersCount;

    public Chat(String chatName, int usersCount) {
        this.chatName = chatName;
        this.usersCount = usersCount;
    }

    @Override
    public int compareTo(Chat o) {

        return chatName.compareToIgnoreCase(o.chatName);

    }

    public String getChatName() {
        return chatName;
    }

    public int getUsersCount() {
        return usersCount;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatName='" + chatName + '\'' +
                ", usersCount=" + usersCount +
                '}';
    }
}
