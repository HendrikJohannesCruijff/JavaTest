package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-기념일 계산기- ");
        System.out.println("만난 년도 입력 : ");
        int year = sc.nextInt();
        System.out.println(" 월 입력 : ");
        int month = sc.nextInt();
        --month;
        System.out.println(" 일 입력 : ");
        int day = sc.nextInt();
        Calendar now = Calendar.getInstance();

        now.set(year, month, day);
        now.add(Calendar.DATE, 100);
        System.out.printf("100일 %tF\n", now);
        now.add(Calendar.DATE, 100);
        System.out.printf("200일 %tF\n", now);
        now.add(Calendar.DATE, 100);
        System.out.printf("300일 %tF\n", now);
        now.add(Calendar.DATE, 100);
        now.add(Calendar.DATE, 100);
        System.out.printf("500일 %tF\n", now);
        now.add(Calendar.DATE, 100);
        now.add(Calendar.DATE, 100);
        now.add(Calendar.DATE, 100);
        now.add(Calendar.DATE, 100);
        now.add(Calendar.DATE, 100);
        System.out.printf("1000일 %tF\n", now);
    }
}
