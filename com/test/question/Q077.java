package com.test.question;

public class Q077 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        int n =1;
        int a =1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {

                arr[i][j] = n;
                n++;
            }

        }



        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }

    }
}
