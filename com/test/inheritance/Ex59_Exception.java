package com.test.inheritance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_Exception {
    public static void main(String[] args) throws IOException {



        /*

            예외, Exception
            - 런타임 오류
            - 컴파일 오류(X) > 실행 중 발견(O)
            - 개발자 미리 예측(O) or 예측(X)

            예외 처리, Exception Handling
            1. 전통적인 방식
                -제어문 사용(조건문)

            2. 전용 방식
                - try catch finally 문 사용



        */
      //  m1();

     //   m2();
      //  m3();
      //  m4();
     //   m5();
    //    m6();
        try {
        int num = 0;
            System.out.println(100 / num);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void m6() {

        // 예외 던지기
        // 요구사항] 숫자 입력 > 처리
        // 조건] 반드시 짝수만 입력
        // 홀수 입력 > 에러 처리

        int num = 5;

        if (num % 2 == 0) {
            System.out.println("업무 진행..");
        } else {
            System.out.println("예외 처리..");
        }

        //try 구현
        try {

            if (num % 2 == 1) {
            throw new Exception("홀수 입력"); //강제로 에러 발생
            }
            System.out.println("업무 진행..");

        } catch (Exception e) {
            System.out.println("예외 처리..");
            e.printStackTrace();
        }


    }

    private static void m5() throws IOException { //  예외 미루기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

    }

    private static void m4() {
        try {
            //0으로 나누기
            int num = 10;
            System.out.println(100 / num); // new ArithmeticException();  오류가 발생하면 해당 오류객체를 만든다.

            //배열 첨자 오류  ArrayIndexOutOfBoundsException
            int[] nums = new int[3];
            nums[5] = 10;

            // 널 참조 NullPointerException
            Scanner sc = null;
            sc.nextLine();

        } catch (ArithmeticException e) {

            System.out.println("0 예외 처리");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(" 배열 첨자");

        } catch (NullPointerException e) {

            System.out.println("널참조");

        } catch (Exception e) {

            System.out.println("예외 처리");

        }


    }

    private static void m3() {

        //0으로 나누기
        try {
            int num = 10;
            System.out.println(100 / num);
        } catch (Exception e) {
            System.out.println("0으로 나누면 안됨");
        }

        //배열 첨자 오류  ArrayIndexOutOfBoundsException
        try {
            int[] nums = new int[3];
            nums[0] = 10;
        } catch (Exception e) {
            System.out.println("배열 첨자");
        }


        // 널 참조 NullPointerException
        try {
            Scanner sc = null;
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("널참조");
        }


    }

    private static void m2() {

        int num = 10;

        try {
            System.out.println(100 / num);
        } catch (Exception e) {
            System.out.println("예외 처리");
        }finally {
            // ? > 마무리 영역 > 무조건 실행되는 블럭 > 뒷수습
            // 예외와 상관없이 항상 실행해야하는 코드
            System.out.println("마지막");
        }
    }

    private static void m1() {
        // 요구사항] 숫자를 입력받아 연산을 하시오.

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 : ");
        int num = scanner.nextInt();
        //비지니스 코드(=업무 코드) > 원래 목적!!
        // try 영역 > 감시!!(CCTV) > 예외가 발생하는지 검사!
        // try문: 일단 실행 > 감시!! > 사고가 터지면 그떄 뒷처리
        try {
            System.out.println(1);
            System.out.printf("100 / %d = %d\n", num, 100 / num);
            System.out.println(2);
        } catch (Exception a) {
           if (a instanceof ArithmeticException) {
                System.out.println("0을 제외한 숫자를 입력하세요");
             a.printStackTrace();
           }
        }
        System.out.println("종료");


    }
}
