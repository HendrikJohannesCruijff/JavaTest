package com.test.java;

import java.io.*;
// BufferedReader , 컴파일,런타임 에러

public class Ex11_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.print(" 문자 입력 : ");

        String str = br.readLine();

        System.out.println("입력하신 문자는 : \"" + str + "\"입니다.");


        // br.read() = 엔터는 자동으로 삭제
        System.out.print("이름 입력 : ");
        String name = br.readLine();
        System.out.printf("안녕하세요%s님\n",name);

        System.out.print("숫자를 입력해 주세요 : ");
        int input = Integer.valueOf(br.readLine());

        System.out.println("input * 2 = " + (input * 2));
        System.out.println(" 소수를 입력해 주세요 : ");

        double input2 = Double.valueOf(br.readLine());
        System.out.println("input2 * 2.3 = " + input2 * 2.3);


        System.out.println(" 첫번째 숫자를 입력해 주세요 : ");
        int first = Integer.valueOf(br.readLine());
        System.out.println(" 두번째 숫자를 입력해 주세요 : ");
        int second = Integer.valueOf(br.readLine());

        System.out.println("first + second = " + (first + second));

        System.out.println("===============================================");

       /*
            에러 , Error
            1. 컴파일 에러
            - 컴파일 작업중에 발생하는 에러
            - 컴파일러가 발견(javac.exe) > 번역하다 > 문법이틀려서
            - 발생 !! > 컴파일 작업중단 > 프로그램 생성불가 > 반드시해결
            - IDE 에서  빨간밑줄
            - 난이도가 낮음 > 발견쉬움


            2. 런타임 에러
            - 런타임(Runtime) > 프로그램 실행중 ..
            - 컴파일 작업 중에는 에러가 없음 > 실행 중에 발생하는 에러
            - 문법에는 오류없는데 다른원인으로 발생하는 에러
            - 에러(Exception)
            - 난이도 중간 > 발견 O , 발견 X > 복불복

            - 충분히 사전에 테스트
            - Ex) 게임출시 > 알파 , 베타테스트 진행

            3. 논리 에러
            - 컴파일성공 + 실행성공 > 결과가 이상
            Ex) 그냥 잘못입력
            - 난이도 최상 > 발견 , 수정 최악
                */
        System.out.print(" 숫자입력  : ");

        String input3 = br.readLine();

        int num = Integer.parseInt(input3);

        try {
            System.out.println(100 / num);
        } catch (ArithmeticException e) {
            System.out.println("에러");
            System.out.println("0으로 나눌수없습니다.");
            e.printStackTrace();
        }



    }
}
