package com.test.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 6, 1, 4, 3, 2, 8, 7, 4, 10, 9));
        System.out.println("삽입 위치 : ");
        int input = sc.nextInt();
        System.out.println("값 : ");
        int num = sc.nextInt();

        System.out.println(list);
        list.add(input, num); // (인덱스,넣을값)

        list.remove(list.size()-1); // 마지막 인덱스 삭제
        System.out.println(list);

    }
}
