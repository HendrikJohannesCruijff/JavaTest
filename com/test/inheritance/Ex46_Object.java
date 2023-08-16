package com.test.inheritance;

public class Ex46_Object {
    public static void main(String[] args) {



        /*

            Object 클래스
            - JDK에서 제공되는 클래스
            - 9개 메서드 > 모든 클래스들에게 공통으로 필요하다 라고 생각한 기능을 구현


        */
        Object o1 = new Object();

        TestChild testChild = new TestChild();

        testChild.a = 10;
        System.out.println(testChild.a);




    }
}
// 개발자가 만드는 모든 클래스는
// 명시적으로 상속을 구현하지 않으면
// 자동으로 Object 클래스의 자식 클래스가 된다.

class TestParent extends Object{
    public int a;
    public int b;
}

class TestChild extends TestParent {
    public int c;
    public int d;
}