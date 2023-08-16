package com.test.question;

public class Q053 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {

            for (int j = 2; j < 10; j++) {
                System.out.printf("%d x %d = %d%3s", j, i, j * i, " ");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 1; i < 10; i++) {

            for (int j = 6; j < 10; j++) {
                System.out.printf("%d x %d = %d%5s", j, i, j * i," ");
            }
            System.out.println();

        }
    }
}
