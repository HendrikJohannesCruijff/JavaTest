package com.test.question;

import java.util.Scanner;

public class Q049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("별개수 입력 : ");
        int num = sc.nextInt();
        StringBuffer sb = new StringBuffer();

        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) { // 별 5개 ,4개 ~ 1개
                sb.append("*");
            }
            sb.append("\n");   //개행
            for (int k = num; k >=i ; k--) {  //빈공간 찍기
                sb.append(" ");
            }

        }
        System.out.println(sb);
    }
}
