package com.test.question;

import java.util.Scanner;

public class Q037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.println("1 ~ "+sum);
    }
}
