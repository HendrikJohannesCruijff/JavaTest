package com.test.question;

import java.util.Scanner;

public class Q029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력 : ");
        int first = sc.nextInt();
        System.out.println(" 두번째 숫자 입력 : ");
        int second = sc.nextInt();
        System.out.println("+, -, *, /, %");
        String operator = sc.next();

        switch (operator) {
            case "+" :
                System.out.println(first + "+" + second + "=" + (first + second));
                break;
            case "-":
                System.out.println(first + "-" + second + "=" + (first - second));
                break;
            case "*":
                System.out.println(first + "*" + second + "=" + (first * second));
                break;
            case "/":
                System.out.println(first + "/" + second + "=" + ((double)first / second));
                break;
            case "%":
                System.out.println(first + "%" + second + "=" + first % second);
                break;
            default:
                System.out.println("연산 불가 ");
        }

    }
}
