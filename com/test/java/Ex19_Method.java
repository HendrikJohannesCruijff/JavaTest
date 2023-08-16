package com.test.java;
// 메서드 4일차 7월 19일
public class Ex19_Method {
    /*
        main 메서드
        - 특수 메서드
        - 이름이 예약어 > main
        - 프로그램이 시작이 되면 자바가 자동으로 호출하는 메서드
        - 프로그램의 시작점 (Entry Point)
        - 프로그램의 종착점(End Point)
            */
    public static void main(String[] args) {

        // 요구사항] "안녕하세요." 출력 x 5
        // 수정사항]
        loop("반갑습니다.", 1);

        // 요구사항 숫자를 한글로 1~10까지 출력

    }

    static void loop(String str, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        }
    }
    // 특정한 목적을 가지는 코드의 집합
    public static void printNumber(){


    }
}
