package com.test.java;

import com.sun.security.jgss.GSSUtil;

public class Ex35_String {
    public static void main(String[] args) {

        /*

            문자열
            - 물리적으로는 참조형이지만 , 약간의 값형의 성질을 가진다.

            1. 메모리의 공간은 한번 할당되면 더 이상 늘리거나 줄일 수 없다.
            2. "문자열은 불변(Immutable)이다." > 한번 만들어진 문자열은 절대 수정할수없다.
            3. 문자열 참조형이다.


        */
     //   m1();
    //    m2();
        m3();
    }

    private static void m3() {  // StringBulider
        //String vs StringBulider
        // 문자열 클래스

        String s1 = "홍길동"; // 문자열 리터럴 사용
        String s2 = new String("홍길동");

        StringBuilder sb = new StringBuilder("홍길동");

        System.out.println(s1);
        System.out.println(sb);

        System.out.println(s1.length());
        System.out.println(sb.length());

        //StringBulider > 수정작업에 용이하다.

        long begin = System.nanoTime();

        // 작업 > String
        String txt1 = "홍길동";
        for (int i = 0; i < 100000; i++) {
            txt1 = txt1 + "."; // 수정작업
        }

        long end = System.nanoTime();
        System.out.println(txt1.length());
        System.out.println(end - begin + "ns");
        System.out.println("=======================");


        begin = System.nanoTime();
        StringBuilder txt2 = new StringBuilder("홍길동");  //


        for (int i = 0; i < 1000000; i++) {
            txt2.append(".");
        }
        end = System.nanoTime();
        System.out.println(txt2.length());
        System.out.println(end - begin + "ns");
    }

    private static void m2() {   // 문자열은 불변이다 > 되도록 하지 말아야하는 행동
        // 문자열은 불변이다 > 되도록 하지 말아야하는 행동
        // 1. 문자열의 잦은 수정
        // 2. 커다란 문자열의 수정   / 쓰레기가 자주많들어져서 자제해야함



        String txt = "홍길동";
        txt = txt + "님"; //수정
        System.out.println(txt);   //

    }

    private static void m1() {
        //  모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변이다.

        int n1 = 10;         // 4byte
        int n2 = 2000000000; // 4byte

        //하나의 메서드안에서 선언된 상수는 같이 사용된다.
        String s1 = "홍길동";
        String s2 = "안녕하세요. 홍길동입니다.";

        String s3 = "홍길동";
        String s4 = "홍";
        s4 += "길동";
        System.out.println(s1 == s3); // 문자열은 무조건 equals 만
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        s1 += "님"; // 홍길동 > 홍길동님


    }
}
