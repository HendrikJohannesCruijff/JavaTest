package com.test.question;

import java.util.Scanner;

public class Q010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        digit(scanner.nextInt());

    }

    static void digit(int num) {

        System.out.printf("%04d",num);

    }
}
