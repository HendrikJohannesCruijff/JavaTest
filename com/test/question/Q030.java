package com.test.question;

import java.util.Scanner;

public class Q030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("소문자 대문자로 바꿔드림");
        System.out.println("영어 문자 입력 : ");
        String input = sc.nextLine();

        char str = input.toUpperCase().charAt(0);

        if (str > 64 && str < 91) {
            System.out.println(input + "의 대문자는 " + str + "입니다.");
        } else {
            System.out.println("영문자만 가능 다시");
        }

    }
}
