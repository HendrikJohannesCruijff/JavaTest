package com.test.question;

import java.util.Scanner;

public class Q001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 출생 년도 입력 : ");
        while (sc.hasNext()) {
            int year = sc.nextInt();
            int age = 2024 - year;
            System.out.println("당신의 나이는 " + age + "입니다. 종료 (ctrl +d)");

        }
    }
}
