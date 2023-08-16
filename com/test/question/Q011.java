package com.test.question;

import java.util.Scanner;

public class Q011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 첫번째 숫자 입력 : ");
        int n1 = sc.nextInt();
        System.out.println(" 두번째 숫자 입력 : ");
        int n2 = sc.nextInt();
        System.out.println(divide(n1, n2));

    }

    static String  add(int a, int b) {
        String result = (a + b) + "";
        return result;
    }

    static String  subtract(int a, int b) {
        String result = (a - b) + "";
        return result;
    }

    static String  multiply(int a, int b) {
        String result = (a * b) + "";
        return result;
    }

    static String  divide(double a, double b) {
       String c = String.format("%.2f", a / b);
        String result = c + "";

        return result;
    }

    static String  mod(int a, int b) {
        String result = (a % b) + "";
        return result;
    }
}
