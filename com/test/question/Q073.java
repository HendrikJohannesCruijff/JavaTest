package com.test.question;

public class Q073 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int n =1;
        int c =5;
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = n;
                n++;
            }
            c--;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
