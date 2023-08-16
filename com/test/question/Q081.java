package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hong@gmail.com";

        String[] result = str.split("@");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
