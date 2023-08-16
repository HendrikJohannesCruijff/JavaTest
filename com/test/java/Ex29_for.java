package com.test.java;

import java.util.Scanner;

// 7월 24일 for문
public class Ex29_for {
    public static void main(String[] args) {

        /*

            for문

            for(초기식; 조건식; 증감식){
                문장;
            }
        */
    //    m1();
    //    m2();
        //   m3();
      //  m4();
     //   m5();
   //     m6();
     //   m7();
  //      m8();
     //   m9();
    //    m10();
     //   m11();
        m15();
    }

    static void m15() {
        // 난수만들기
        int radom = 0;
        for (int i = 0; i < 10; i++) {
         radom = (int)( Math.random() * 4)+1;
        System.out.println(radom);
        }
    }

    static void m13() {
        //빈 리턴문
        // 값을 반환이 목적x
        // 메서드 중단 역할만함
        return;
    }
    static  int m12() {
        // return문 true,false 상항 둘다 return을 해줘야 오류안생김
        int num = 10;
        if (num % 2 == 0) {
            return 10;
        }
        return 5;
    }

    private static void m11() {
        // 요구사항] 사용자 숫자입력 > 입력받은 숫자 누적 > 입력 횟수?
        // 추가사항] 홀수만 입력
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("숫자입력(홀수만) : ");
        for (int i = 0; ; i++) {
        int num = sc.nextInt();
            if (num % 2 == 0) {
                break;
            }
        sum += num;
        }
        System.out.println(sum);
    }

    private static void m10() {
        // 요구사항] 학교 담임 선생님 > 학생 상담 > 1~30;
        for (int i = 0; i < 31; i++) {
          /*  if (i == 16) {
                break;
            }*/
            if (i == 10 || i == 15) {
                continue;
            }
            System.out.printf("%d번 학생 상담중..\n  ",i);
        }
    }

    private static void m9() {
        // break , continue > 독립적 사용 불가 > 다른제어문과 함께 사용
        // break > 자신이 속한 제어문 탈출
        // continue > 실행 > 제어문의 시작으로 이동
        for (int i = 0; i < 11; i++) {

            if (i == 5) {
                //  break;
                continue;
            }
            System.out.println(i);
        }
    }

    private static void m8() {
        // 무한 루프
        for (int i = 0; ; i++) {
            System.out.println(i);
        }
      //  for (; ; ) {
      //      System.out.println("무한루프");
      //  }

    }

    private static void m7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단 : ");
        int sum = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %2d\n", sum, i, sum * i);

        }


    }

    private static void m6() {
        // 요구사항] 사용자로부터 숫자 10개 입력받아 출력
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("숫자 10번 입력 (%d) : ", i + 1);
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum);

    }

    private static void m5() {
        // 요구사항] 사용자가 원하는 숫자까지의 합
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void m4() {
        //요구사항] 1~10까지의 합

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    private static void m3() {
        // 반복문 > 루프 변수?
        // 2. 루프 변수의 역할 > 회전수 or 값
        // 요구사항] 숫자 1~10; 출력
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

    }

    private static void m2() {

        for (int i = 5; i > 0; i--) {
            System.out.println("hi");
        }

    }

    private static void m1() {
        // 요구사항] 안녕하세요 x 5;

        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
        }
    }
}
