package com.test.java;

import java.util.Scanner;

public class Ex18_Operator {
    public static void main(String[] args) {
/*

        요구사항] 사용자로부터 문자 1개 입력 > 영소문자인지 검사?
         > 유효성 검사

         1. 스캐너생성
         2. 안내 메세지 출력
         3. 문자입력
         4. 영어 소문자 검사
         5. 결과 출력
*/
        Scanner sc = new Scanner(System.in);


        System.out.println("대소문자 구분 프로그램 : 종료 (ctrl + d)");

        while (sc.hasNext()) {
            System.out.print(" 문자 입력 : ");

            String input = sc.next();

            char result = input.charAt(0);
            System.out.println((result < 91 ? "대문자" : "소문자"));
        }
        // 아스키 코드 값
        // A(65) ~ Z(90)
        // a(97) ~ (122)
        // 0(48) ~ 9(57)

    }
}
