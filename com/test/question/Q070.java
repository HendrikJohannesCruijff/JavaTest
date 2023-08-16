package com.test.question;

public class Q070 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        int n =1;
        int c = 0;
        int b =0;
        for (int i = 0; i < 5; i++) {
            b = n+4;
            for (int j = 0; j < 5; j++) {
                if (i == 1 || i == 3) {
                    arr[i][j] = b;
                    b--;
                    if (i == 3) {
                        n = 2 * 10 + 1;
                    } else {
                    n = ((i) * 10) + 1;

                    }
                }else{
                    arr[i][j] = n;
                n++;
                }
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

