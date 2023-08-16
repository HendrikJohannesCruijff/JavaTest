package com.test.inheritance;

public class Ex49_static {
    public static void main(String[] args) {

        /*

            요구사항]
            1. 펜을 생산
            2. 펜의개수 세라
        */

        // Pen 객체(클래스)와 count 간의 관계 약함.
        // 오차 발생(count++ 누락)
  /*      int count = 0;
        Pen p1 = new Pen("monami", "black");
        count++;

        Pen p2 = new Pen("monami", "black");
        count++;
        Pen p3 = new Pen("monami", "black");
        count++;

        System.out.println(count);

        // Case 2
        // Pen과 count간의 결합 > 강하게
        // 객체 변수 > 여러개 발생
        // 그중 1개 사용 > 왜 그 객체의 count 사용하는지? 당위성(x)

        Pen p4 = new Pen("monami", "black");
        p4.count++;

        Pen p5 = new Pen("monami", "black");
        p3.count++;*/




        // Case 3
        // Pen과 count 간의 관계 > 강하게
        // count 변수 딱 1개 만들자

/*
        Pen p1 = new Pen("monami", "black");
        Pen.count++;
        Pen p2 = new Pen("monami", "black");
        Pen.count++;

        System.out.println("Pen.count = " + Pen.count);*/


        // Case 4
        //  생성자에  (static)count++; 넣어놓기

        Pen p1 = new Pen("monami", "black");
        Pen p2 = new Pen("monami", "black");
        Pen p3 = new Pen("monami", "black");
        System.out.println("Pen.count = " + Pen.count);
    
    }
}

class Pen{

    public static int count = 0;
    private String model;
    private String color;

    public Pen(String model, String color) {
        this.model = model;
        this.color = color;
        Pen.count++;  //펜 만들때마다 카운트 증가
    }

    @Override
    public String toString() {
        return "Pen{" +
                "count=" + count +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
