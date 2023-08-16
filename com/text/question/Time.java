package com.text.question;

public class Time {
    private int hour;
    private int minute;
    public int second;

    public Time(){

    }

    public Time(int hour, int minute, int second) {

        this.second = second % 60;
        this.hour = (second / 60 + minute) / 60;
        this.minute = (second / 60 + minute) % 60;
        this.hour += hour;
    }

    public Time(int minute, int second) {
        this(0, minute, second);
    }

    public Time(int second) {
        this(0, 0, second);
    }
    public String info(){
        return String.format("%d:%02d:%02d"
                , hour, minute, second);
    }
}
