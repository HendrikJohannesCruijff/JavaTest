package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q063 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        System.out.println("nums = "+Arrays.toString(dump(arr)));

    }

    static String[] dump(int[] list) {
        String[] arr = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            arr[i] = String.valueOf(list[i]);
        }
        return arr;
    }


}
