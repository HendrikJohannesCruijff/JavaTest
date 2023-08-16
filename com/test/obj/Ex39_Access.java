package com.test.obj;

import java.util.Calendar;

public class Ex39_Access {
    public static void main(String[] args) {

        /*

            접근 제어자 , Access Modifier
            - 클래스 맴버에 붙여서 사용한다. > 맴버 변수 , 맴버 메서드
            - 클래스 자체에 붙여서 사용한다.
            - 클래스(객체)의 영역을 기준으로 ,외부에 해당 맴버를 어떻게 노출할지 통제하는 역할

            1. public
            2. protected > 상속
            3. default > 패키지
            4. private
        */
        Box box = new Box();

        box.color = "갈색";
        box.setSize(100);
        System.out.println(box.color);
        System.out.println(box.getSize());

        box.aaa();
       // box.bbb();

        // 접근 지정자 > 가이드라인


        Book book = new Book();

        book.setTitle("자바의 정석");
        book.setPrice(30000); // 쓰기 > Setter
        System.out.println(book.getPrice()); // 읽기 > Getter

        Mouse mouse = new Mouse();

        mouse.setModel("M910");
        System.out.println(mouse.getModel());

        //쓰기전용 , Getter가 없는 상황
        mouse.setPrice(50000);
        // System.out.println(mouse.getPrice);


        // 읽기전용 , Setter가 없는 역할
        System.out.println(mouse.getColor());

        //Getter/Setter 역할
        // 1. private 맴버 > 인터페이스 역할
        // 2. 읽기 전용 맴버 , 쓰기 전용 맴버

        Calendar date = Calendar.getInstance();
        date.add(Calendar.YEAR, -3);

       // mouse.setDate(date);

      //  System.out.printf("마우스 제조년월일 : %tF\n",mouse.getDate());

        //mouse.getState > private String state;
   //     System.out.println(mouse.getState());


        mouse.setDate(2000, 7, 31);
        System.out.println(mouse.getDate());

        // 개발자가 객체의 상태를 확인하고 싶을떄 사용하는 메서드 > dump
        System.out.println(mouse.info());

    }
}
