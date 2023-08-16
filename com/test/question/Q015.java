package com.test.question;

import java.util.Scanner;

public class Q015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 맑은날 입력 : ");
        int sunny = scanner.nextInt();
        System.out.println(" 흐린날 입력 : ");
        int foggy = scanner.nextInt();

        System.out.println("사과가 총 " + getApple(sunny, foggy) + "개 열렸습니다");
    }

    static int getApple(int sunny, int foggy) {
        sunny *= 5;
        foggy *= 2;
        int sum = sunny + foggy;

        int result = sum > 99 ? (sum - 100) / 10 : 0;
        return result;
    }
}
