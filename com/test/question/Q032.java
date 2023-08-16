package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q032 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("들어온 시 입력 :");
        int inHour = sc.nextInt();
        System.out.println("들어온 분 입력 : ");
        int intMinute = sc.nextInt();

        System.out.println("나간 시 입력 :");
        int outHour = sc.nextInt();
        System.out.println("나간 분 입력 : ");
        int outMinute = sc.nextInt();

        int in = inHour * 60 + intMinute;

        int out = outHour * 60 + outMinute;

        int result = (((out - in) - 30) / 10) * 2000;

        System.out.println("주차 요금은 " + result + "원 입니다.");
    }
}
