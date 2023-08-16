package com.test.question;

import java.util.Scanner;

public class Q012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("짝수,홀수를 판별해드립니다 ");
        System.out.print(" 숫자 입력 : ");

        getNumber(sc.nextInt());
    }

    static void getNumber(int a) {
        String result = (a % 2 == 0 ? "짝수" : "홀수");
        System.out.printf("입력하신 숫자 : %d는 %s입니다.", a, result);
    }
}
