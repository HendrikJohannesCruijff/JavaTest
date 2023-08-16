package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12_Scanner {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.print("문자 입력 : ");

        String str = sc.nextLine();
        System.out.println(str);

        System.out.print("숫자 입력 : ");
        int input = sc.nextInt();
        System.out.println(input);

        System.out.print("소수 입력 : ");
        double d = sc.nextDouble();
        System.out.printf("%.2f+%.2f=%.2f", d, d, d + d);
        sc.close();
    }
}
