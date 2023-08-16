package com.test.collection;

import Question93.Main;

public class Ex66_Anonymous {
    public static void main(String[] args) {


        /*

            익명 객체 , Anonymous Object
             - 익명 클래스 , Anonymous Class
             - 이름없는 클래스
             -


        */

        // 요구사항] 인터페이스를 구현한 클래스 선언 > 객체 생성



        //2. 부모 타입(인터페이스)으로 참조 변수 만들기
/*
        MyFunction b2 = new MyFunction() {
            @Override
            public void aaa() {
                System.out.println("hi");
            }
        };
        b2.aaa();*/
        MyFunction mf = () -> System.out.println("hi");
        mf.aaa();

        Test123 t = (a, b) -> a > b ? a : b;
        System.out.println(t.max(5, 9));



        // 클래스 재사용성 때문에
        // 익명 클래스 > 재사용 의사 없어서
        // 익명 클래스 > 붕어빵틀 > 붕어빵을 딱 1개만 만들기 위한 틀

    }
}

@FunctionalInterface
interface MyFunction {
    void aaa();
}

@FunctionalInterface
interface Test123{
    int max(int a, int b);
}


