package com.test.question;

import java.util.Scanner;

public class Q035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 입력 : ");
        String name = sc.next();
        System.out.println("횟수 입력 : ");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.println(name + "님 안녕하세요");

        }
    }
}
