package com.test.question;

import java.util.LinkedList;
import java.util.Scanner;

public class Q055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i < 101; i++) {

            if ((num % i == 0)) {  // 약수 검사후 리스트에 넣기
                list.add(i);
            }
        }
        list.removeLast(); // num 자기자신을 삭제
        System.out.println(list);
    }
}
