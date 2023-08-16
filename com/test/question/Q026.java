package com.test.question;

import java.util.Scanner;

public class Q026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수 입력 : ");

        int kor = sc.nextInt();

        char score = 'a';



        if (kor > 89) {
            score = 'A';
        } else if (kor > 79) {
            score = 'B';
        } else if (kor > 69) {
            score = 'C';
        } else if (kor > 59) {
            score = 'D';
        } else {
            score = 'F';
        }

        System.out.printf("국어점수 : %d점 성적 \"%s\"", kor, score);
    }
}
