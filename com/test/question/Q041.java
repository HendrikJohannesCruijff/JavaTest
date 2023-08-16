package com.test.question;

import java.util.Scanner;

public class Q041 {
    public static void main(String[] args) {


        int sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            System.out.print(i);
            if (sum >= 1000) {
                break;
            }
            System.out.print("+");

        }
        System.out.println("="+sum);
    }
}
