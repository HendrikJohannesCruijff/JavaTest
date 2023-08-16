package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("숫자 : ");
            nums[i] = sc.nextInt();
        }

        for (int i = nums.length; i > 0; i--) {
            System.out.println("nums[" + (i - 1) + "] = " + nums[i - 1]);
        }


    }
}
