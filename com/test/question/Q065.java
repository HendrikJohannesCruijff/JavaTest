package com.test.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("최대 범위 : ");
        int max = sc.nextInt();
        System.out.println("최소 범위 : ");
        int min = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();


        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            int num1 = (int) (Math.random() * 20) + 1;
            arr[i] = num1;
        }
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
            if (max >= arr[i] && arr[i] >= min) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);

    }
}
