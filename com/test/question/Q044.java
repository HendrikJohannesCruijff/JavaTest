package com.test.question;

import java.util.Scanner;

public class Q044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int sum = 0;

        for (; ; ) {
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();


            if (num % 2 == 0) {
                sum += num;
                sb.append("+" + num);
            } else {
                sum -= num;
                sb.append("-" + num);
            }
            if (sum > 100) {
                break;
            }
        }
        System.out.println(sb+"="+sum);
    }
}
