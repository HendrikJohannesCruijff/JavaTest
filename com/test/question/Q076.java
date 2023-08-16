package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q076 {
    public static void main(String[] args) {
        String[][] score = new String[10][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수 입력 : ");
        int kor = 10-(sc.nextInt()/10);
        System.out.println("영어 점수 입력 : ");
        int eng = 10-(sc.nextInt()/10);
        System.out.println("수학 점수 입력 : ");
        int math = 10-(sc.nextInt()/10);

        System.out.println(kor);
        System.out.println(eng);
        System.out.println(math);
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {


                if (i >= kor) {
                    score[i][0] = "■";
                }else {
                    score[i][0] = " ";
                }
                if (i >= eng) {
                    score[i][1] = "■";
                }else {
                    score[i][1] = " ";
                }
                if (i >= math) {
                    score[i][2] = "■";
                } else {
                    score[i][2] = " ";
                }


            }
        }
        printArr(score);
        System.out.println("  ---------------");
        System.out.println("  국어  영어  수학");

    }   public static void printArr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5s", arr[i][j]);
            }
            System.out.println();
        }

    }

    }

