package com.test.inheritance;

public class Ex68 {
    public static void main(String[] args) {


        // this vs super
        // - 객체 지정 연산자
        // this : 자기자신
        // super : 부모

        CupParent p = new CupParent();


        CupChild c = new CupChild();
        p.check();
        System.out.println();
        c.check();
    }

}

class CupParent{
    private int a =10;
    public int b = 20;

    public void check(){
        System.out.println(a);
        System.out.println(b);
    }


}

class CupChild extends CupParent {
    private int c =30;
    public int d = 40;


    public void check(){
        super.check();
        System.out.println(c);
        System.out.println(d);

    }



}
