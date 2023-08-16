package com.test.question;

import java.util.Scanner;

public class Q016 {
    public static void main(String[] args) {

        add(1);
        add(1,2);
        add(1,2,3);
        add(1, 2, 3, 4);
        add(1, 2, 3, 4, 5);
    }

    static void add(int a) {
        System.out.println("a = " + a);
    }
    static void add(int a,int b) {
        System.out.println("a + b = " +( a + b));
    }
    static void add(int a,int b , int c) {
        System.out.println("a + b + c = " + (a + b + c));
    }

    static void add(int a, int b, int c, int d) {
        System.out.println("a + b + c + d = " +( a + b + c + d));
    }

    static void add(int a, int b, int c, int d, int e) {
        System.out.println("a+b+c+d+e = " + (a + b + c + d + e));
    }

}
