package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 입력(한사람 입력후 스페이스바하고 다시입력 다입력시 엔터) : ");
        String[] str = sc.nextLine().split(" ");
        Arrays.sort(str);
        System.out.println("입력한 학생은총 " + str.length + "명 입니다.");
        for (int i = 0; i < str.length; i++) {
            System.out.println((i+1)+"."+str[i]);
        }

    }
}
