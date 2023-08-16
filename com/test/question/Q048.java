package com.test.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> alist = new ArrayList<>();
        ArrayList<Integer> blist = new ArrayList<>();
        System.out.println("최대 9자리 정수 입력 : ");
        String str = sc.nextLine();


        for (int i = 0; i < str.length(); i++) {
            String a = str.substring(i, i+1);
            int b = Integer.parseInt(a);

            if (b % 2 == 0) {
                alist.add(b);
            } else {
                blist.add(b);
            }
        }
        int aresult = 0;
        for (int i = 0; i < alist.size(); i++) {
            aresult += alist.get(i);
        }
        System.out.println("짝수의 합 : " + aresult);
        int bresult = 0;
        for (int i = 0; i < blist.size(); i++) {
            bresult += blist.get(i);
        }
        System.out.println("홀수의 합 : "+bresult);
    }
}
