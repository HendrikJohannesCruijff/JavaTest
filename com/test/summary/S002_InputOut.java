package com.test.summary;

import java.util.Scanner;

public class S002_InputOut {
    public static void main(String[] args) {

        //콘솔 출력

        System.out.print(" 기본 출력 ");

        System.out.println(" 라인 출력");

        System.out.printf("포멧 출력");

        // 형식 문자
        System.out.printf("%,10.1f",123453.34314);


        // 콘솔 입력
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력
        String str = scanner.nextLine();

        // 숫자 입력
        int num = scanner.nextInt();

    }

}
