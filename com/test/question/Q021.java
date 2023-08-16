package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("태어난 년도 입력 : ");
        Calendar calendar = Calendar.getInstance();

        int age = 0;
        int year = sc.nextInt();

        age = calendar.get(Calendar.YEAR) - year + 1;
        System.out.println("나이 : " + age);
    }
}
