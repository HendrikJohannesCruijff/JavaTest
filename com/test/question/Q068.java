package com.test.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q068 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 3, 2, 8, 7, 10, 4, 9};

        int index = 2; // 삭제되어야할 인덱스번호

        System.out.println(Arrays.toString(arr));

        for (int i = index; i < arr.length-1; i++) { // 2부터 8까지 반복됨
            //왼쪽방 = 오른쪽방
            arr[i] = arr[i + 1]; // 삭제되는부분부터 계속다음 인덱스를 앞인덱스에 복사해서 넣음

        }
        arr[arr.length - 1] = 0; // 마지막인덱스에 0을 넣음
        System.out.println(Arrays.toString(arr));

    }
}
