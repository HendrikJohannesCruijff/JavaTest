package com.test.question;

import java.util.Scanner;

public class Q039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작 숫자 입력 : ");
        int start = sc.nextInt();
        System.out.println("종료 숫자 입력 : ");
        int end = sc.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
            System.out.print(i);
            if (i < end) {
                System.out.print("+");
            }


        }
        System.out.println("="+sum);
    }
}
