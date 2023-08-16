package com.test.java;

import java.util.Scanner;

public class Ex16_Operator {
    public static void main(String[] args) {

        /*
            비교연산자
            - > , >= ,< , <= ,==,!=
            - 2항연산자
            - 피연산자들의 우의 비교하는 연산자

        */

        int a = 10;
        int b = 3;
        System.out.printf("%d > %d = %b\n", a, b, a > b);
        System.out.printf("%d >= %d = %b\n", a, b, a >= b);
        System.out.printf("%d < %d = %b\n", a, b, a < b);
        System.out.printf("%d <= %d = %b\n", a, b, a <= b);
        System.out.printf("%d == %d = %b\n", a, b, a == b);
        System.out.printf("%d != %d = %b\n", a, b, a != b);

        System.out.println("===========================================");
        // 요구사항] 사용자 나이입력 > 19세 이상 통과 , 미만 거절
        Scanner sc = new Scanner(System.in);
        System.out.println(" 나이 입력 : ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("O");
        } else System.out.println("x");


        // String 은 equals 로 비교

    }
}
