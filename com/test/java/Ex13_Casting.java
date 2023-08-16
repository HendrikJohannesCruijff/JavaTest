package com.test.java;

import java.util.Arrays;

public class Ex13_Casting {
    public static void main(String[] args) {
        /*

        형변환
       - Casting , Data Type Casting
       - 하나의 자료형을 또 다른 자료형으로 변환하는 작업
       - 코드 작성을 유연하게 하기 위해서 사용
       - int > double
       - float > short

       1. 암시적 형변환(자동 타입 변환)
       - 큰자료형 = 작은자료형
       - 100% 안전한 작업
       - 복사를 했을 때 원본과 항상 동일한 값 복사

       2. 명시적 형변화(강제 타입 변환)
       - 작은자료형 = 큰자료형
       - 경우에 따라 다르다.
       - 늘 신경써서 관리할 것
       - 명시적 형변환 시 발생하는 데이터가 넘치는 형상 > 오버플로우(OverFlow)
       1 위로 넘치는 현상 > Overflow
       2 아래로 넘치는 현상 > Underflow

       *** 오버플로우가 발생할 만한 상황을 미리 예측해서 관리가 필요하다.

        */

        byte a ;  //원본
        short b;  //복사본
        a = 10;
        b = a;
        System.out.println(b);

        // 암시적 형변환
        // short(2) = byte(1)
        // (자료형) : 형변환 연산자
        b = (short) a; // 써도 안써도 상관없다 해서 암시적 형변환
        System.out.println(b);


        // 왼쪽이 작은 자료형
        short e;
        byte f;
        e = 1000;
        f = (byte) e;

        System.out.println(f);

        String[] arr = {"a"};
        System.out.println(Arrays.toString(arr));

        System.out.println("============================");
        // 오버플로우
        long h = 3000000000L;
        int g;

        g = (int) h;
        System.out.println(g);

    }
}
