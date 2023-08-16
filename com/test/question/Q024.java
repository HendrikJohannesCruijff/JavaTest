package com.test.question;

import java.util.Scanner;

public class Q024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시 입력 : ");
        int hour = sc.nextInt();;
        System.out.println("분 입력 : ");
        int minute = sc.nextInt();


        m1(hour,minute);
        m2(hour,minute);
        m3(hour,minute);

    }

    static void m1(int hour, int minute) {
        minute -= 10;
        hour = hour + (minute / 60);
        System.out.printf("짜장면 %d시 %d분\n", hour, minute);

    }
    static void m2(int hour, int minute) {
        minute -= 18;
        hour = hour + (minute / 60);
        System.out.printf("치킨 %d시 %d분\n", hour, minute);

    }
    static void m3(int hour, int minute) {
        minute -= 25;
        hour = hour + (minute / 60);
        System.out.printf("피자 %d시 %d분\n", hour, minute);

    }
}
