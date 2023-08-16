package com.test.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

// 연산자 7월 18일  3일차
public class Ex15_Operator {
    public static void main(String[] args) {

/*
        연산자 ,Operator

        1. 문장 , Statement
        2. 표현식 , Expression
        3. 연산자 , Operator
        4. 피연산자, Operand
        5. 연산자 우선순위
        6. 연산자 연산 방향

        문장 Statement
        - 1개 이상의 표현식이 모여서 문장을 만든다.
        - int sum = 10 + 20;

        표현식 , Expression
        - 문장의 구성하는 최소단위 > 하나의 완성된 문장을 만들수있는 최소 표현
        - int sum;
        - 10 + 20;
        - sum = 30;

        연산자 , Operator
        - +
        - =

        피연산자 , Operand
        - A , B
        - 10 , 20

        연산자 우선 순위
        - 하나의 문장에 속해있는 연산자들 중 누가 먼저 실행하는지에 대한 규칙
        - 1 + 2 * 3
        - 사칙연산

        연산자 연산 방향
        - 하나의 문장에 속해있는 연산자들 중 우선 순위 동일하면 누구
        -1 + 2 + 3

        연산자 종류
        1. 행동(목적)
        - 산술 연산자 >  - , + , * , / , %(mod , 나머지)  > 2항 연산자  > 숫자만 계산
        - 비교 연산자
        - 논리 연산자
        - 대입 연산자
        - 증감 연산자
        - 조건 연산자
        - 비트 연산자


        2. 용법(피연산자 개수)
        - 1항 연산자
        - 2항 연산자
        - 3항 연산자

*/
        // 예외 상황 > byte , short 연산 결과는 무조건 int 이다 > CPU 처리 단위
        // byte + byte = int
        // short + short = int
        // 정수사용 > byte , short 사용 안함
        // 정수는 주로 int 사용

        System.out.println();
        System.out.println(10 % 3);
        System.out.println(10 % 4);
        System.out.println(10 % 5);
        System.out.println(10 % 10);
        System.out.println(10 % 11);

        // 나머지 연산자
        // - 패턴
    }
}
