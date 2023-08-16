package com.test.question;

public class Q054 {
    public static void main(String[] args) {
        System.out.print(2 + " ");
        System.out.print(3 + " ");
        System.out.print(5 + " ");
        System.out.print(7 + " ");
        for (int i = 2; i < 100; i++) {
            if (!(i % 2 == 0) && !(i % 3 == 0) && !(i % 5 == 0) && !(i % 7 == 0)) {

                System.out.print(i + " ");
            }

        }
    }
}
