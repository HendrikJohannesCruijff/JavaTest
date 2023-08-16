package com.test.java;

import java.util.Scanner;

public class Ex28_switch {
    public static void main(String[] args) {

        /*

            switch 문 , case문
            - 조건이 boolean 이 아닌 일반값이다 > 정수 , 문자열 , 열거형(enum)
            - if문보다 활용도가 떨어진다.
            - if문 보다 가독성이 좋다

            switch(조건) {

                  case1 값 :
                  문장
                  break;
                  case2 값 :
                  문장
                  break;
                  case3 값 :
                  문장
                  break;
                  default :
                  문장
                  break;
             }
        */

     //   m1();
      //  m2();
        m3();
    }

    private static void m3() {
        // 요구사항] 사용자가 월을 입력 > 해당월의 마지막일
        Scanner sc = new Scanner(System.in);

        System.out.println(" 각 달의 일수를 알려드립니다 : ");
        int month = sc.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31일 입니다");
                break;
            case 4, 6, 9, 11:
                System.out.println("30일 입니다");
                break;
            case 2:
                System.out.println("28일 또는 29일 입니다.");
                break;
        }

    }

    private static void m2() {

        // 요구사항] 자판기
        // - 메뉴 출력 > 음료 선택 > 가격 출력
        Scanner sc = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("      자판기 ");
        System.out.println("===================");
        System.out.println("1. 콜라");
        System.out.println("2. 사이다");
        System.out.println("3. 박카스");
        System.out.println("==================");
        System.out.println("선택(번호) : ");

        int input = sc.nextInt();

        // 값: > Label(표시판)
        switch (input) {
            case 1:
            case 2:
                System.out.println("600원 입니다");
                break;
            case 3:
                System.out.println("500원 입니다");
                break;
            default:
                System.out.println(" x ");
                break;
        }


    }

    private static void m1() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 숫자 : ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("1입니다");
                break;
            case 2:
                System.out.println("2입니다");
                break;
            default:
                System.out.println("x");
        }

    }
}
