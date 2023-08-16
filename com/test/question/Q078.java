package com.test.question;

public class Q078 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = n;
                arr[i][4] += n;
                arr[4][j] += n;
            }
        n++ ;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
