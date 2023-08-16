package com.test.question;

import java.util.ArrayList;

public class Q056 {
    public static void main(String[] args) {
        ArrayList<Integer> first_list = new ArrayList<>();
        ArrayList<Integer> second_list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int first = 12;
        int second = 8;

        for (int i = 1; i < first; i++) {
            if (first % i == 0) {
                first_list.add(i);
            }
        }
        for (int i = 1; i < second; i++) {
            if (second % i == 0) {
                second_list.add(i);
            }
        }
   //     int size = first_list.size() > second_list.size() ? first_list.size() : second_list.size();


        for (int i = 0; i < first_list.size(); i++) {
            for (int j = 0; j < second_list.size(); j++) {
                if (first_list.get(i) == second_list.get(j)) {
                    result.add(first_list.get(i));
                }
            }
        }
        System.out.print(first+"의 약수 : ");
        for (Object x : first_list) {
            System.out.print(x+",");
        }
        System.out.println();
        System.out.print(second+"의 약수 : ");
        for (Object x : second_list) {
            System.out.print(x+",");
        }
        System.out.println();
        System.out.printf("%d와 %d의 공약수 : ", first, second);
        for (Object x : result) {
            System.out.print(x + ",");
        }

    }

}
