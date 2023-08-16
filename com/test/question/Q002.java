package com.test.question;

import java.util.Scanner;

public class Q002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력 : ");
        int first = sc.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        int second = sc.nextInt();

        System.out.println("first + second = " + (first + second));
        System.out.println("first - second = " + (first - second));
        System.out.println("first * second = " + (first * second));
        System.out.printf("first / second = %.2f\n", (double) first / second);
        System.out.println("first % second = " + (first % second));

    }
}
