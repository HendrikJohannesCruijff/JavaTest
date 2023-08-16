package com.test.question;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Q034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년도 입력 : ");
        int year = sc.nextInt();
        System.out.println("월 입력 : ");
        int month = sc.nextInt();
        System.out.println("일 입력 : ");
        int day = sc.nextInt();

        // 1. LocalDate 생성
        LocalDate date = LocalDate.of(year, month, day);

        System.out.println(date);

        // 2. DayOfWeek 객체 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // 3. 숫자 요일 구하기
        int dayOfWeekNumber = dayOfWeek.getValue();

        String result = "";

        switch (dayOfWeekNumber) {
            case 0:
                result = "일요일";
                break;
            case 1:
                result = "월요일";
                break;
            case 2:
                result = "화요일";
                break;
            case 3:
                result = "수요일";
                break;
            case 4:
                result = "목요일";
                break;
            case 5:
                result = "금요일";
                break;
            case 6:
                result = "토요일";
                break;

        }
        if (!(result.equals("일요일") || result.equals("토요일"))) {
            System.out.println("입력하신 날짜는 평일입니다 ");
        }
            System.out.println(result);
    }
}
