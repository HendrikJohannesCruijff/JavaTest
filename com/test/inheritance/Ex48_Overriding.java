package com.test.inheritance;

public class Ex48_Overriding {
    public static void main(String[] args) {

        // 대중적인 오버라이드

        Time time = new Time(5, 30);
        System.out.println(time);

    }
}
class Time{

    private int hour;
    private int minute;



    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    public Time(int hour) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }
}

