package com.test.question;

import java.util.Scanner;

public class Q080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.println("문장 입력 : ");
        String str = sc.nextLine();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);
    }
}
