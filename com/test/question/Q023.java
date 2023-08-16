package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아빠 생일 년도 :");
        int year = sc.nextInt();
        System.out.println("달 :");
        int month = sc.nextInt();
        System.out.println("일 : ");
        int date = sc.nextInt();

        System.out.println("딸 생일 년도 :");
        int year2 = sc.nextInt();
        System.out.println("달 :");
        int month2 = sc.nextInt();
        System.out.println("일 : ");
        int date2 = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        Calendar now = Calendar.getInstance();

        long nowTick = now.getTimeInMillis();

        calendar.set(year, month, date); // 아빠 생년월일

        Calendar calendar1 = Calendar.getInstance();

        long calendarA = calendar.getTimeInMillis();

        calendar1.set(year2, month2, date2); // 딸 생년월일

        long calendarB = calendar1.getTimeInMillis();

        System.out.printf("아빠는 딸보다 총 %d일을 더  살았습니다."
                , ((nowTick - calendarA) / 1000 / 60 / 60 / 24) - (nowTick - calendarB) / 1000 / 60 / 60 / 24);

    }
}
