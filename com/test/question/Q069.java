package com.test.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이 입력 : ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;

        }
        int[] result = oper(arr);

        System.out.println(" 원본 : " + Arrays.toString(arr));
        System.out.println(" 결과 : " + Arrays.toString(result));

    }
    static int[] oper(int[] arr) {
        String result = "[";
        int[] temp = new int[arr.length / 2];

        for (int i = 0; i < arr.length; i += 2) {
            temp[i / 2] = arr[i + 1] + arr[i];

        }
        return temp;
    }
}
