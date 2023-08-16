package com.test.question;

import java.util.Scanner;

public class Q028 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("근무 년수 입력 : ");
        int input = sc.nextInt();

        if (input > 0 && input < 5) {
            System.out.printf("%d년차 주니어 개발자입니다. %d년 더하면 시니어 개발자가된다네요 ", input, (5 - input));
        } else if (input > 4 && input < 10) {
            System.out.printf("%d년차 시니어 개발자입니다. %d년전 까지 주니어개발자였고 , %d년더 근무하면 고오급개발자가 됩니다."
                    , input, (input - 4), (10 - input));
        } else if (input > 9) {
            System.out.printf("%d년차 개발자입니다.당신은 %d년전까지 중급 개발자였습니다.", input, (input - 9));
        } else {
            System.out.println("1이상의 값을 넣어주세여");
        }
    }
}

