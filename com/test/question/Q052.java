package com.test.question;

import java.util.Scanner;

public class Q052 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char c = 'a';
        for (int i = num; i > 0; i--) {

            for (int j = 1; j < i; j++) { // 앞 빈공간 출력 4 ~ 1
                sb.append(" ");
            }
            for (int k = num; k >= i; k--) {
                sb.append(c);
                c++;
            }
            for (int k = num; k >= i; k-- ) {
                c--;
                sb.append(c);
            }
            c = 'a';
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
