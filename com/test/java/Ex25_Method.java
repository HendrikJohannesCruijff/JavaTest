package com.test.java;

public class Ex25_Method {
    public static void main(String[] args) {

        // 재귀 메서드 , Recursive , Method
        // 메서드 구현부에서 자기 자신을 호출하는 메서드
        // 구조가 복잡
        // 파일 디렉토리 구조에서 많이 사용

        m2(5);

        // 팩토리얼
        // 4! = 4 x 3 x 2 x 1 = 24

        System.out.println(factorial(4));
    }

    static void m1() {
        System.out.println("m1");
    }

    static int m2(int n) {
        System.out.println(n);

        return (n == 1) ? 1 : m2(n - 1);
    }

    private static int factorial(int n) {
        return (n == 1) ? 1 : n * factorial(n - 1);
    }
}
