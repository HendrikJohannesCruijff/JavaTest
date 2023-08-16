package com.test.java;

public class Ex24_Method {
    public static void main(String[] args) {


        // Swap
        // - 2개의 공간의 값을 서로 교환하는 작업


        swap(5, 6);

    }

    static void swap(int a, int b) {
        System.out.printf("a : %s b: %s \n ", a, b);

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.printf("a : %s b: %s \n ", a, b);

    }


}
