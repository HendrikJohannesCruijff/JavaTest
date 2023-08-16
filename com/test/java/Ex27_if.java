package com.test.java;

import java.util.Scanner;
// if , else if , else 문
public class Ex27_if {
    public static void main(String[] args) {

        /*

            제어문
            - 수많은 명령어들의 흐름(실행순서)를 통제하는 수단
            - 조건제어 , 반복 제어 , 분기 제어

            1. 조건문
                - 개발자가 조건을 제시한 후 결과에 따라 흐름을 제어
                    a . if
                    b. switch

            2. 반복문
                - 특정 코드를 개발자가 원하는 횟수만큼 반복 제어
                    a. for
                    b. while
                    c. do while
                    d. for(forEach, 향상된 for문)
            3. 분기문
                - 개발자가 코드의 흐름을 원하는 곳으로 이동
                    a. break
                    b. continue


        */
     //   m1();
       // m2();
     //   m3();
     //   m4();
        m5();
    }

    private static void m5() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("A. 어떤 개발툴을 선호하십니까?");
        System.out.println("1. 메모장");
        System.out.println("2. 이클립스");
        System.out.println("3. 인텔리제이");
        System.out.println("선택(번호입력) : ");

        int input = sc.nextInt();
        if (input == 1) {
            sum += 3;
        } else if (input == 2) {
            sum += 5;
        } else if (input == 3) {
            sum += 7;
        }
        System.out.println("B 선호하는 언어 : java(1) , c#(2) , python(3) 숫자입력");
        int input2 = sc.nextInt();
        if (input2 == 1) {
            sum += 3;
        } else if (input2 == 2) {
            sum += 5;
        } else if (input2 == 3) {
            sum += 7;
        }
        System.out.println("완료");
        System.out.println("결과");
        if (sum > 10) {
            System.out.println("네카라쿠배");
        } else if (sum > 5) {
            System.out.println("스타트업,중견");
        } else {
            System.out.println("si , sm");

        }

    }
    private static void m4() { // 중첩 if문

        Scanner sc = new Scanner(System.in);
        System.out.println(" 색상 입력 : ");
        String color = sc.next();

        if (color.equals("빨강") || color.equals("파랑") || color.equals("노랑")) {

            if (color.equals("빨강") || color.equals("파랑")) {
                System.out.println("15,000원 입니다.");
            } else if (color.equals("노랑")) {
                System.out.println("20,000원 입니다");
            }
        } else {
            System.out.println("재교 없음");

        }
    }

    private static void m3() { // if , else if , else문
        Scanner sc = new Scanner(System.in);

        System.out.println(" 색상 입력 : ");
        String color = sc.next();
        if (color.equals("빨강") || color.equals("파랑")) {
            System.out.println("15,000원 입니다.");
        } else if (color.equals("노랑")) {
            System.out.println("20,000원 입니다");
        } else {
            System.out.println("재고없음");
        }
    }

    private static void m2() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 시간 입력 : ");
        int hour = sc.nextInt();

        if (hour < 6) {
            System.out.println("지하철");

        } else if (hour < 7) {
            System.out.println("버스");

        } else if (hour < 8) {
            System.out.println("택시");
        } else {
            System.out.println("병가");

        }

    }

    private static void m1() {
/*

        if 문
        - 개발자가 조건(boolean)을 제시> 결과에 따라 흐름을 제어

        if(조건식) {
         문장;
        }
        else{
         문장;
        }

*/
        if (true) {
            System.out.println("참");

        }
        if (false) {
            System.out.println("거짓");
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.printf("입력한 %d는 양수입니다", num);
        } else if (num < 0) {
            System.out.printf("입력한 %d는 음수입니다.", num);

        } else {
            System.out.println("입력한 숫자는 0 입니다");

        }


    }
}
