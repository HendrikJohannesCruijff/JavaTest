package com.test.question;

import java.util.Scanner;

public class Q036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작 숫자 입력 : ");
        int start = sc.nextInt();
        System.out.println("종료 숫자 입력 : ");
        int end = sc.nextInt();
        System.out.println("증감치 입력 : ");
        int num = sc.nextInt();

        for (int i = start; ; i++) {

            if (start > end) {
                break;
            }
            System.out.println(start);
            start += num;
        }
    }
}
