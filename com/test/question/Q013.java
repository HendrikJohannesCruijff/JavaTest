package com.test.question;

import java.util.Scanner;

public class Q013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 국어 점수 입력 : ");
        int kor = scanner.nextInt();
        System.out.println(" 영어 점수 입력 : ");
        int eng = scanner.nextInt();
        System.out.println(" 수학 점수 입력 : ");
        int math = scanner.nextInt();
        System.out.println(test(kor, eng, math));

    }

    static String test(int kor, int eng, int math) {
        int total = kor + eng + math;
        String result = (total / 3) > 59 && (kor > 39 && eng > 39 && math > 39) ? "합격입니다" : "불합격입니다.";
        return result;
    }
}
