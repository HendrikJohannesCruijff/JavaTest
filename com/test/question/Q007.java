package com.test.question;

import java.util.Scanner;

public class Q007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력한 소문자의 대문자를 알려드립니다. 종료(ctrl + D)");

        System.out.println(" 문자 입력 : ");
        while (sc.hasNext()) {
            String input = sc.nextLine();
            System.out.println(" 입력한 문자 : " + input);

            System.out.println("입력하신 문자 " + input + "의 대문자는 \"" + input.toUpperCase() + "\" 입니다. 종료 할려면 (ctrl + D)");


        }
    }
}
