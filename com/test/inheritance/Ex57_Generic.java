package com.test.inheritance;

public class Ex57_Generic {
    public static void main(String[] args) {


        //클래스
        //1.클래스
        //2.인터페이스
        //3.추상 클래스
        //4. enum
        //5. 제네릭 클래스

        // 요구사항] 클래스 설계\
        //1.맴버 변수  > int
        //2.맴버 변수를 중심으로 여러가지 행동을하는 메서드선언


        Wrapper<Integer> n1 = new Wrapper(100);

        System.out.println(n1);
        System.out.println(n1.getData()*2);
        System.out.println();

        Wrapper<String> s1 = new Wrapper<>("hi");
        System.out.println(s1);
        System.out.println(s1.getData().length());

        Wrapper<Boolean> b1 = new Wrapper<Boolean>(true);
        System.out.println(b1);
        System.out.println(b1.getData() ? "참" : "거짓");


        // **** 절대 > 값형과 참조형간의 형변화 불가능

        // Object 변수 == 만능 주머니(모든 자료형을 담을 수 있는 변수)
        Object o1 = new Object();
        Object o2 = new String();
        //--------------------------------------------------
        Object a = 10;  // 박싱(Boxing) > 오토박싱
        Object b = "홍길동";

        System.out.println((int) a * 10);





    }
}

class Wrapper<T> {

    private T data; // 1. 클래스의 중심

    // data 중심 > 행동

    public Wrapper(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "WrapperInt[" +
                "data=" + data +
                ']';
    }
}
