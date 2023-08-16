package com.test.obj;

public class Ex42_Constructor {
    /*

           생성자 , Constructor
           -(특수한 목적을 가진) 메서드
           - 맴버를 초기화하는 역할

    */
    public static void main(String[] args) {

    Box box = new Box();

    //모든 참조형(배열 포함)은 객체 생성 직후 자동으로 맴버가 초기화가 된다.
        //1.new 객체 생성 연산자 > 객체를 생성한다.
        //2.Cup()

    Cup cup = new Cup();

        System.out.println(cup.info());

        Cup cup2 = new Cup();
        cup2.setColor("green");
        cup2.setSize(500);
        System.out.println(cup2.info());

        Cup cup3 = new Cup("pink");
        System.out.println(cup3.info());
        Cup white = new Cup("white", 200);
        System.out.println(white.info());

        Cup cu = new Cup(300);
        System.out.println(cu.info());

        // 생성자는 반드시 new와 함께 사용이 가능하다. > 생성자는 평생 딱 1번만 호출이 가능하다.

    }
}
