package com.test.question;

import java.util.Scanner;

public class Q047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("=================");
            System.out.println("      자판기");
            System.out.println("=================");
            System.out.println("1. 콜라: 700원");
            System.out.println("2. 사이다: 600원");
            System.out.println("3. 비타500: 500원");
            System.out.print("음료 선택(번호 , 종료하실려면 (4)) : ");
            int num = sc.nextInt();
            if (num == 4) {
                System.out.println("자판기 종료");
                break;
            }
            System.out.print("금액 투입(원) :  ");
            int money = sc.nextInt();
            if (num == 1) {
                money -= 700;
                System.out.println("콜라");
                System.out.println("잔돈 : " + money);
            } else if (num == 2) {
                money -= 600;
                System.out.println("사이다");
                System.out.println("잔돈 : " + money);
            } else if (num == 3) {
                money -= 500;
                System.out.println("비타500");
                System.out.println("잔돈 : " + money);
            }

        }
    }
}
