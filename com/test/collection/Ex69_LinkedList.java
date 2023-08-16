package com.test.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex69_LinkedList {
    public static void main(String[] args) {


        // 물리 구조 + 인터페이스(사용법)


       // m1();
       // m2();
        //중간에 데이터 추가하기 , 삽입(Insert > Shift 발생 )



    }

    private static void m2() {
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();

        long begin = 0, end = 0;

        System.out.println("순차적으로 데이터 추가하기 ");

        begin = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(i); // 배열끝에 추가하기
        }

        end = System.currentTimeMillis();
        System.out.printf("LinkedList 작업 시간 : %,dms\n", end - begin);

        System.out.println("순차적으로 데이터 추가하기 ");


        begin = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arr.add(i); // 배열끝에 추가하기
        }

        end = System.currentTimeMillis();
        System.out.printf("ArrayList 작업 시간 : %,dms\n", end - begin);
    }

    private static void m1() {


        // LinkedList vs ArraysList
        // List > 구현 > 사용법이 아주 유사 > 개발자 경험
        // 내부 구조가 다름. > 사용 용도가 다르다

        //LinkedList 종류
        // 1. LinkedList: 일방 통행
        // 2. Doulbe LinkedList : 양방향 통행


        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(10);
        list.add(20);
        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));



    }
}
