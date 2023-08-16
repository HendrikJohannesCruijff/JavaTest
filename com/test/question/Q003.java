package com.test.question;

import java.util.Scanner;

public class Q003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("사각형 너비(cm) 입력 : ");
        int first = sc.nextInt();
        System.out.print("사각형 높이(cm) 입력 : ");
        int second = sc.nextInt();

        System.out.printf("사격형의 넓이는 %d 입니다\n", (first * second));
        System.out.printf("사격형의 둘레는 %d 입니다 \n", (first * 2) + (second * 2));
    }
}
