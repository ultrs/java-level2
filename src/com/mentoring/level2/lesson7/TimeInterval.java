package com.mentoring.level2.lesson7;

public class TimeInterval {
    private final int hour;
    private final int minutes;
    private final int seconds;

    public TimeInterval(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeInterval(int totalSeconds) {
        hour = totalSeconds / 3600;
        minutes = totalSeconds % 3600 / 60;
        seconds = totalSeconds % 3600 % 60;
    }

    public int totalSeconds() {
        return hour * 3600 + minutes * 60 + seconds;
    }

    public TimeInterval plus(TimeInterval interval) {
        return new TimeInterval(totalSeconds() + interval.totalSeconds());
    }
    public void print(){
        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}
