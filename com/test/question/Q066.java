package com.test.question;

import java.util.Arrays;
import java.util.Random;

public class Q066 {
    public static void main(String[] args) {

        Random r = new Random();

        int[] arr = new int[6];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (r.nextInt(45)) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;  // 되돌아가서 난수 다시 넣기

                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
