package com.test.java;

public class Ex30_for {
    public static void main(String[] args) {

        // 중첩된 반복문
        // 2중 for문


    //    m1();
     //   m2();
      //  m3();
     //   m4();
       m5();
     //   m6();
    }

    private static void m6() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void m5() {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
    }


    private static void m4() { // 달력 찍기

        int n = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d",n);
                n++;
            }
            System.out.println();
        }
    }

    private static void m3() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (i == 5 || j == 5) {

                    break; // 안의 for문 을 탈출한다 (j 루프 탈출)
                }
                System.out.printf("i:%d , j : %d\n ", i, j);
            }
        }
    }

    private static void m2() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 31; j++) {
                System.out.printf("%d강의실 %d번 학생\n",i,j);
            }
        }
    }

    private static void m1() {  //구구단
        for (int j = 1; j < 10; j++) {

            for (int i = 1; i < 10; i++) {
                System.out.printf("%d X %d = %d\n",j,i,j*i);
            }
            System.out.println("===================================");
        }
    }
}
