package com.test.question;

import java.util.LinkedList;
import java.util.Scanner;

public class Q038 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        int a = 0;
        int b = 0;
        int aCount = 0;
        int bCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("홀,짝 개수 판별");
        System.out.println("숫자 입력 : 종료하실려면(ctrl+d) : ");
        while (sc.hasNext()) {
            System.out.println("숫자 입력 종료하실려면(ctrl+d) :");
            list.add(sc.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                a += list.get(i);
                aCount++;
            } else if (list.get(i) % 2 == 1) {
                b += list.get(i);
                bCount++;
            }
        }
        System.out.println("입력하신 숫자 : "+list);
        System.out.println("짝수 "+aCount+"개의 합은 : " + a);
        System.out.println("홀수 "+bCount+"개의 합은 : " + b);
    }
}
