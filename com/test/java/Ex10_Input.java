package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

import static java.lang.System.in;
// 안중요함 버림
public class Ex10_Input {
    public static void main(String[] args) throws Exception {
        // 콘솔 입력 > 키보드

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        Scanner sc = new Scanner(System.in);

        // 요구사항] 사용자에게 문자 1개를 입력받아 > 화면에 출력하세요.

        //1
        System.out.print("문자입력 : ");
    /*
                2
             입력대기상태 > 블럭 걸렸다
             엔터 입력
             read() 메서드 1회당 > 문자 1개입력
             /r == 13

    */
        int a = System.in.read();
        System.out.println(a);
        System.out.printf("출력:%c\n", a);
        System.out.println("프로그램종료");

        System.out.println("===========================================");
    /*    System.out.print("메세지를 하나 입력해주세요 :");
        String scan = sc.nextLine();
        System.out.println("입력하신 메세지입니다 : " + scan);*/


    }
}
