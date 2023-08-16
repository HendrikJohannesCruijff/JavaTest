package com.test.java;

public class Ex21_Method {
    public static void main(String[] args) {

        System.out.println(getNum());
        System.out.println(getName("홍길동"));

    }

    // return문
    // - 메서드 종료
    // - 값을 반환
    static int getNum() {
        return 1;
    }

     static String getName(String name) {

         return "고객명 : " + name;
    }
}
