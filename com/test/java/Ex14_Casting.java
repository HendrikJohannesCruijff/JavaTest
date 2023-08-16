package com.test.java;

public class Ex14_Casting {
    public static void main(String[] args) {


        byte b1 = 10;
        short s1 = 10;
        int n1 = 10;
        long l1 = 10;

        System.out.println("======================================");

        int n2 = 100;
        float n3 ;

        n3 = n2;
        System.out.println(n3);

        int n4;
        float n5 = 100;

        n4 = (int) n5;
        System.out.println("n4 = " + n4);
        System.out.println("========================================");

        char m1 = 'A';
        short m2;

        m2 = (short) m1;
        System.out.println("m2 = " + m2);

        System.out.println("========================================");

        String str = String.valueOf(10);

        System.out.println("str + 30 = " + (str + 30));

        System.out.println("str+\" \"+20 = " + 10 + "" + 20);
    }
}
