package com.test.question;

import java.util.LinkedList;
import java.util.Scanner;

public class Q031 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("홀,짝 개수 판별");
        System.out.println("숫자 입력 : 종료하실려면(ctrl+d) : ");
        while (sc.hasNext()) {
            System.out.println("숫자 입력 종료하실려면(ctrl+d) :");
            list.add(sc.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                a++;
            } else if (list.get(i) % 2 == 1) {
                b++;
            }
        }
        System.out.println("입력하신 숫자 : "+list);
        if (a > b) {

            System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.짝수가 홀수보다 %d개 많습니다", a, b, (a - b));

        } else {
            System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.홀수가 짝수보다 %d개 많습니다", a, b, (b - a));
        }

    }
}
