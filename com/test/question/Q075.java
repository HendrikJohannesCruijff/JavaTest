package com.test.question;

/*          1    2    3    4   10
            5    6    7    8   26
            9   10   11   12   42
           13   14   15   16   58
           28   32   36   40  136
           찎기*/
public class Q075 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int n = 1;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                arr[i][j] = n;   // 인덱스 0~ 3까지
                arr[i][4] += n;
                arr[4][j] += n;
                arr[4][4] += n;

                n++;


            }
        }
printArr(arr);



    }
    public static void printArr(int[][] arr) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }

    }


}

