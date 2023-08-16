package com.test.question;

import java.util.Scanner;

public class Q043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = (int) (Math.random() * 10) + 1;
        int count = 0;
        System.out.println("숫자 맞추기");

        for (int i = 0; ; i++) {
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();
            if (num == com) {
                count++;
                System.out.println("맞았습니다.");
                System.out.println("답은 : " + num + "입니다");
                System.out.println("시도횟수 : " + count);
                System.out.println(" 프로그램 종료 ");
                break;
            } else if (!(num == com)) {
                count++;
                System.out.println("틀렸습니다.");
            } else if (count > 9) {
                System.out.println("실패");
                System.out.println("컴퓨터의 숫자는 : " + com);
                System.out.println(" 프로그램 종료 ");
                break;

            }
        }
    }
}
