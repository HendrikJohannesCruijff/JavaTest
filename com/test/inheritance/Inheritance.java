package com.test.inheritance;

public class Inheritance {

    public static void main(String[] args) {
        /*

            상속 , Inheritance
            - 부모가 가지는 재산을 자식에세 물려주는 행동
            - 부모 클래스가 가지는 재산을 자식 클래스에게 물려주는 행동

            - 자식 클래스가 코드를 구현하지 않아도, 부모클래스로부터 구현된 코드를 물려받는 행동

            왜why?
            - 비용 절감
            - 코드재사용 (*************************************************)



        */

        Parent p = new Parent();
        p.a = 10;
        p.b = 20;
        Child c = new Child();




        System.out.println(p.a);




    }

}

class Parent {
    public int a;
    public int b;

    public void aaa() {
        System.out.println("aaa");
    }


}

class Child extends Parent {

    public int c;
    public int d;
    public void ccc(){
        System.out.println("ccc");
    }

}

//회원
//1.일반 회원
// -이름
// -아이디
// -암호
// -이메일
//2.관리자 회원
// -이름
// -아이디
// -암호
// -등급

// 일반 회원
class Member{
    public String name;
    public String id;
    public String pw;
}

class User extends Member {

    public String email;

}

class Administrator extends Member {

    public String lv;
}

class AAA{
    public int a = 10;
}
class BBB extends AAA{
    public int b = 20;

}

class CCC extends BBB   {
    public int c = 30;
}
class DDD extends CCC{
    public int d = 40;
}

