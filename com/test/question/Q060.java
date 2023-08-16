package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q060 {


    public static void main(String[] args) {

        int sum = 0 , fibo_last;
        for (int i = 1; ; i++) {
            sum += fibo(i);

            if (fibo(i) > 100) {
                fibo_last = fibo(i);
                break;
            }
            System.out.print("+" + fibo(i));
        }
        System.out.print("="+(sum-fibo_last));

    }

    static int fibo(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return fibo(num - 1) + fibo(num - 2);
        }
    }
}
