package com.test.question;

import java.util.Scanner;

public class Q014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("역의 개수 입력 : ");
        int station = sc.nextInt();
        System.out.println("환승 횟수 입력 : ");
        int change = sc.nextInt();
        System.out.println("시간대 입력(숫자입력) : 평상시(1),출근시(2),퇴근시(3)");
        int time = sc.nextInt();

        System.out.println("총 소요 시간은 "+getTime(station, change, time)+"분입니다.");
    }

    static int getTime(int station, int change, int time) {

        station *= 2;
        change = change * (time + 2);


        return station + change;
    }
}
