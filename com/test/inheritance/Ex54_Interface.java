package com.test.inheritance;

public class Ex54_Interface {
    public static void main(String[] args) {

        /*

               상속
               1. 단일 상속
               2. 다중 상속 > 부모개 2개이상

               *** 자바는 다중 상속을 허용하지 않는다.
               *** 인터페이스에서는 다중 상속을 허용한다. > 인터페이스는 구현부가 없어서

        */

        // 회사의 직원
        Hong hong = new Hong();

        hong.출근하다();
        hong.일을한다();
        hong.퇴근하다();

        hong.애들하고놀기();
        hong.낮잠자기();
        hong.돈벌기();

    }
}
interface 아빠{
    void 애들하고놀기();
    void 돈벌기();
    void 낮잠자기();
}

interface 직원    {

    void 출근하다();
    void 퇴근하다();
    void 일을한다();

}

class Hong implements 직원, 아빠 {
    @Override
    public void 애들하고놀기() {

    }

    @Override
    public void 돈벌기() {

    }

    @Override
    public void 낮잠자기() {

    }

    @Override
    public void 출근하다() {

    }

    @Override
    public void 퇴근하다() {

    }

    @Override
    public void 일을한다() {

    }
}

class Lee implements 직원{
    @Override
    public void 출근하다() {

    }

    @Override
    public void 퇴근하다() {

    }

    @Override
    public void 일을한다() {

    }
}

class Park implements 아빠 {
    @Override
    public void 애들하고놀기() {

    }

    @Override
    public void 돈벌기() {

    }

    @Override
    public void 낮잠자기() {

    }
}