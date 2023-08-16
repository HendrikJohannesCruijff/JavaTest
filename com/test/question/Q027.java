package com.test.question;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Q027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("영어 문자 하나입력 : ");
        String input = sc.nextLine();
        String str = input.toUpperCase();

        switch (str) {
            case "F":
                System.out.println("Father");
                break;
            case "S":
                System.out.println("Sister");
                break;
            case "M":
                System.out.println("Mother");
                break;
            case "B":
                System.out.println("Brother");
                break;
            default:
                System.out.println("입력한 문자가 올바르지않음");
        }
    }
}
