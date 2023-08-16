package com.test.cast;

public class Ex55_Casting {
    public static void main(String[] args) {



        /*

             형변환 , Type Casting
             1. 값형 형변환
             2. 참조형 형변환
                -참조형끼리 형변환
                -클래스끼리 형변환

                참조형 형변환

                -상속관계 클래스 간의 형변환만 지원
                -직계끼리만가능
                A클래스 > B 클래스


                1.업캐스팅 UpCasting
                - 암시적 형변환
                - 100% 안전
                > 자식 클래스 > 부모 클래스

                2.다운캐스팅 Down Casting
                -명시적 형변환
                - 불안정 > 100% 불가능
                >ㅇ 부모 클래스 > 자식 클래스

        */

        Parent p1;
        Child c1;
        c1 = new Child();

        //복사
        //Parent = Child
        //암시적인 형변환
        // 업캐스팅
        // 100퍼 안전
        p1 = c1;
        p1 = (Parent) c1; // 원형

        // 복사 후 검증 방법? > 복사된 참조 변수(p1) >

     p1.a = 10;
     p1.b = 20;

        System.out.println(p1.a);
        System.out.println(p1.b);


/*


        Parent p2;
        Child c2;

        p2 = new Parent();

        // 명시적인 형변화
        // Child = Parent
        // 자식 클래스 = 부모 클래스
        // 다운 캐스팅
        c2 = (Child) p2;

        // 검증? 복사본을 사용하는데 문제가 없는지?

        c2.a = 10;
        c2.b = 20;
        c2.c = 30;
        System.out.println(c2.a);
        System.out.println(c2.b);
        System.out.println(c2.c);

*/



        Parent p3;
        Child c3 = new Child();

        // 업캐스팅
        p3 = c3;










        Child c4;

        c4 =(Child)p3;
        c4.a = 10;
        c4.b = 29;
        c4.c = 30;

        System.out.println(c4.a);
        System.out.println(c4.b);
        System.out.println(c4.c);
    }
}

class Parent{
    public int a;
    public int b;

}
 class Child extends  Parent{
    public int c;

}