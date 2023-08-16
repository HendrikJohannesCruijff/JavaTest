package com.test.question;

import java.util.*;

public class Q046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    list.add("일");
                    break;
                case 2:
                    list.add("이");
                    break;
                case 3:
                    list.add("삼");
                    break;
                case 4:
                    list.add("사");
                    break;
                case 5:
                    list.add("오");
                    break;
                case 6:
                    list.add("육");
                    break;
                case 7:
                    list.add("칠");
                    break;
                case 8:
                    list.add("팔");
                    break;
                case 9:
                    list.add("구");
                    break;
            }
        }
        for (Object x : list) {
            System.out.print(x);
        }
    }
}
