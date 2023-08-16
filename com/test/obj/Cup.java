package com.test.obj;

public class Cup {

    private String color;

    private int size;
    /*

    컴파일러가 자동으로 생성하는 코드. > 기본생성자
    1.메서드명이 클래스명과 동일하다.(반드시 일치)
    2.반환타입이 생략되어 있다.> 반환값을 가질수 없다.> 무조건 void > 생략
    3.구현부 > 일반 메서드
     */


     Cup(){
         // **** 생성자의 역할
         // 맴버를 초기화하는 전용 메서드
         // 방금 new가 만든 갓 태어난 객체를 초기화하는 역할
    /*    this.color = "yellow";
        this.size = 300;
    */
         this("yellow", 300);
     }

    //생성자 오버로딩
    Cup(String color) {
    //    this.color = color;
     //   this.size = 300;
        this(color, 300);
    }

    Cup(int size) {
    //    this.color = "yellow";
     //   this.size = size;
        this("yellow", size);
    }

    Cup(String color, int size) {
        this.color = color;
        if (size > 0 && size < 3000) {  //this() 생성자 쓰는이유 유효성검사 한번만하면 되니까
        this.size = size;
        }
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public String info() {
        return "색상:" + color + ", 크기:" + size;
    }

}
