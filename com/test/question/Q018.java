package com.test.question;

public class Q018 {
    public static void main(String[] args) {
        System.out.println("양수 : " + positive(1) + "개");
        System.out.println("양수 : " + positive(1, 2) + "개");
        System.out.println("양수 : " + positive(1, 2, 3) + "개");
        System.out.println("양수 : " + positive(1, 2, 3, 4) + "개");

    }

    static int positive(int a) {
        int result = 0;
         result += (a > 0) ? 1 : 0;
        return result;


    }

    static int positive(int a, int b) {

        int result = 0;
        result += (a > 0) ? 1 : 0;
        result += (b > 0) ? 1 : 0;
        return result;

    }

    static int positive(int a, int b, int c) {

        int result = 0;
        result += (a > 0) ? 1 : 0;
        result += (b > 0) ? 1 : 0;
        result += (c > 0) ? 1 : 0;
        return result;

    }

    static int positive(int a, int b, int c, int d) {

        int result = 0;
        result += (a > 0) ? 1 : 0;
        result += (b > 0) ? 1 : 0;
        result += (c > 0) ? 1 : 0;
        result += (d > 0) ? 1 : 0;
        return result;

    }
}
