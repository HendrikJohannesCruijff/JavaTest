package com.test.question;

import java.util.Scanner;

public class Q082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();


        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Integer.valueOf(num.substring(i, i+1));
            if (i > num.length()-2) {
                System.out.print(num.substring(i, i + 1));
            } else {
            System.out.print(num.substring(i, i + 1) + "+");
            }
        }

        System.out.println("="+sum);
    }
}
