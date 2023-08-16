package com.test.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q064 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            int num1 = (int) (Math.random() * 20) + 1;
            arr[i] = num1;
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
