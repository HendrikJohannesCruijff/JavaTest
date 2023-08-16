package com.test.java;

public class Ex23_Method {
    public static void main(String[] args) {

/*
        메서드 오버로딩 , Method Overloading

 */
        drawLine();
        drawLine("*");


    }

    // 요구사항] 선을 그리는 메서드를 선언하세요
    static void drawLine(){
        System.out.println("-------------------------------");
    }

    static void drawLine(String s) {
        for (int i = 0; i < 30; i++) {
            System.out.print(s);
        }
    }

    static void test(byte a) {
        System.out.println(" 1 ");

    }

    static void test(int c) {
        System.out.println(" 2 ");
    }

}
