package com.test.inheritance;
// 인터페이스
public class Ex51_interface {
    public static void main(String[] args) {

        /*

            인터페이스 , interface
             -클래스의 일종
             -자료형
             -객체르 생성 할수 없다.
             - 참조 변수는 가능
             - 클래스의 부모역할

//******* 인터페이스는 상속받는 여러 클래스의 행동을 통일시키는 역할> 행동 규약 정의



        */

        Mouse m = new G304();

        m.click();
        m.click();



    }
}

interface Mouse {

    // 인터페이스는 추상 맴버만 가질 수 있다.(추상 메서드)

    // ***** 인터페이스는 구현된 맴버를 가질 수 없다.


    //***** 인터페이스는 구현부를 가진 메서드를 소유할 수 없다.
    //추상 메서드 , Abstract Method
    // - 구현부 없이 선언부만 가지는 메서드
    public void click();

}

// *** 인터페이스를 상속받는 클래스 반드시 인터페이스의 추상 메서드를 구현해야 한다.
class M705 implements Mouse {

    // 구현했다
    @Override
    public void click() {
        System.out.println("클릭");
    }
}

class G304 implements Mouse {
    @Override
    public void click() {
        System.out.println("클릭");
    }
}




