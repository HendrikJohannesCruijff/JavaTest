package com.test.inheritance;

import java.util.ArrayList;

public class Ex53_interface {
    public static void main(String[] args) {



        Keyboard k = new Mxkeys();

        k.powerOn();
        k.powerOff();
        System.out.println(k.checkBatter());
        k.keyDown('A');

    }

}
// *** keyboard는 객체를 생성할수 없다 > 실체화 할 수 없다. >
interface Keyboard{

    // 키보드로서 갖춰야할 행동들 정의(선언부(o) , 구현부(x)) > 호출사용법
    public void keyDown(char c);

    public void powerOn();
    public void powerOff();

    public int checkBatter();

}

class Mxkeys implements Keyboard {
    @Override
    public void keyDown(char c) {
        System.out.println(c+"누름");
    }

    @Override
    public void powerOn() {
        System.out.println("전원킴");

    }

    @Override
    public void powerOff() {
        System.out.println("전원 꺼짐");
    }

    @Override
    public int checkBatter() {
        return 80;
    }
}

