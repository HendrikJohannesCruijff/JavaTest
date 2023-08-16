package com.test.question;

public class Q017 {
    public static void main(String[] args) {

        position("홍길동");
        position("홍길동", "유재석");
        position("홍길동", "유재석", "박명수");
        position("홍길동", "유재석", "박명수", "정형돈");
    }

    static void position(String s) {
        System.out.println("사원 : " + s);
        System.out.println();
    }
    static void position(String s,String s1) {
        System.out.println("사원 : " + s + "\n대리 : " + s1);
        System.out.println();
    }

    static void position(String s, String s1, String s2) {

        System.out.println("사원 : " + s + "\n대리 : " + s1 + "\n과장 : " + s2);
        System.out.println();
    }
    static void position(String s, String s1, String s2,String s3) {

        System.out.println("사원 : " + s + "\n대리 : " + s1 + "\n과장 : " + s2 + "\n부장 : " + s3);
        System.out.println();
    }


}
