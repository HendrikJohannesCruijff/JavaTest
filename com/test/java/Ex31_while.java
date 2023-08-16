package com.test.java;

import java.util.Scanner;

public class Ex31_while {
    public static void main(String[] args) {

       // m1();
      //  m2();
      //  m3();
        m4();
    }

    private static void m4() {
        // 콘솔 > UI
        // 자판기
        // 1. 메뉴출력
        // 2. 선택
        // 3. 결과
        Scanner sc = new Scanner(System.in);

        int sel = 0;  // 사용자 선택 메뉴 번호
        boolean loop = true;
        while (loop) {

            menu();
            sel = sc.nextInt();

            if (sel == 1) {
                print("콜라");
                pause(sc);  // 콘솔 한턴 쉬어가기 메서드
            } else if (sel == 2) {
                print("사이다");
                pause(sc);
            } else if (sel == 3) {
                print("커피");
                pause(sc);
            } else {
                loop = false;
            }

        }
        System.out.println("프로그램 종료");

    }

    private static void print(String s) {
        System.out.println(s);
    }

    private static void menu() { // 자판기 화면
        System.out.println("=================");
        System.out.println("      자판기");
        System.out.println("=================");
        System.out.println("1.콜라");
        System.out.println("2.사이다");
        System.out.println("3.커피");
        System.out.println("4.종료");
        System.out.println("선택(번호) : ");
    }

    private static void pause(Scanner sc) {   // Extract Method 메서드 추출
        System.out.println("계속하려면 아무숫자(문자)나 입력하세요");  //콘솔일때 한턴쉬어가기 방법
        sc.next();
    }


    private static void m3() {

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        int num = 1;
        while (num < 11) {
            sum += num;
            num++;
        }
        System.out.println(sum);

    }

    private static void m2() { //do while 문 , 필요없음

        int num = 11;
        while (num < 11) {
            System.out.println(num);
            num++;
        }
        System.out.println();


   num =11;
        do {
            System.out.println(num);
            num++;
        } while (num < 11);
    }


    private static void m1() {
        // 요구사항] 1~10 까지 출력

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        int num = 1; // 초기식
        while (num <= 10) { //조건식

            System.out.println(num);
            num++;
        }
    }
}
