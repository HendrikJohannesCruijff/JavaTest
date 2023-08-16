package com.test.question;

public class Q045 {
    public static void main(String[] args) {

        int num = 50;
        for (int i = 1; i < num; i++) {
            if ((i / 10 == 3 || i / 10 == 6 || i / 10 == 9) && (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)) {
                System.out.print("짝짝,");
            } else if (i > 29 && i < 40) {
                System.out.print("짝,");
            } else if ((i % 10) == 3 || (i % 10) == 6 || (i % 10) == 9) {
                System.out.print("짝,");
            } else if (i == 3 || i == 6 || i == 9) {
                System.out.print("짝,");
            } else {
                System.out.print(i+",");
            }

        }

    }
}
