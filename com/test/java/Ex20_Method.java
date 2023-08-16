package com.test.java;

public class Ex20_Method {
    public static void main(String[] args) {

    /*
        메서드 인자 리스트
        - 파라미터(Parameter)
        - 인자(Arguments)
        - 매개변수
    */
    // 요구사항] 홍길동에게 인사를 하는 메서드 구현

        hello("홍길동");
        hello("아무개");
        System.out.println(checkAge(18));

    }

    static void hello(String string) { // 인사 메서드
        System.out.println(string + "님 안녕하세요");
    }

    static String checkAge(int age) { // 성인 , 미성년자 체크 메서드
        String result = (age >= 19 ? "성인" : "미성년자");
        return result ;
    }

}
