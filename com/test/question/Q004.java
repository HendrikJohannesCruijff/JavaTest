package com.test.question;

import java.util.Scanner;

public class Q004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 섭씨 입력 : ");
        double input = scanner.nextDouble();

        System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.",input, (input * 1.8) + 32);
    }
}
