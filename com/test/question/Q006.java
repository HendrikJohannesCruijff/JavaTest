package com.test.question;

import java.util.Scanner;

public class Q006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("월급 입력 : ");
        int input = scanner.nextInt();

        System.out.println("세금 3.3%");
        System.out.printf("한달 수입 : %,d원\n", input);
        System.out.printf("세후 금액 : %,d원\n", (int) (input * 0.967));
        System.out.printf("떼인 세금 : %,d원\n", (int) (input * 0.033));
    }

}
