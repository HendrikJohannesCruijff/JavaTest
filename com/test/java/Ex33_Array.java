package com.test.java;

import java.util.Arrays;

public class Ex33_Array {
    public static void main(String[] args) {

        // 다차원 배열

        //m1();
       // m2();
       // m3();
       // m4();
        m5();
    }

    private static void m5() {   // 달력찍기
        int[][] arr = new int[5][5];
        int n =1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = n;
                n++;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }

    }

    private static void m4() {  // 배열안에 원하는 값이 있는지 확인하는 코드
        String[] member = {"가", "나", "다", "라", "마", "바", "사", "아", "자", "차", "카", "타", "파"};

        String name = "하";

        // 1. 배열 > 원하는 데이터 존재하는지 검색
        if (contains(member, name)) {
            System.out.println(name+" 발견!");

        } else {
            System.out.println(name+" 없음;");
        }
        int index = indexOf(member, name);
        System.out.println(index);
    }

    private static int indexOf(String[] member, String name) { // 해당 인덱스 찾는 메서드
        for (int i = 0; i < member.length; i++) {
            if (member[i].equals(name)) {
                return i;
            }
        }
        return -1; // 없는경우는 -1 로 리턴
    }

    private static boolean contains(String[] member,String name) { // 입력받은 값이 있으면 true 없으면 false
        for (int i = 0; i < member.length; i++) {
            if (member[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    private static void m3() {

        int[] arr1 = {10, 20, 30};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();

        int[][] arr2 = {{10, 20, 30}, {30, 40, 50}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println("arr2[i][j] = " + arr2[i][j]);

            }
        }

    }

    private static void m2() {
        int[] arr1 = {10, 20, 30};

        int[][] arr3 = new int[2][3];
        int[][] arr4 = {{10, 20, 30}, {40, 50, 60}};

        int[][][] arr6 = {
                {{10, 20, 30}, {40, 50, 60}}, {{10, 20, 30}, {40, 50, 60}}};
    }
    int[][][] arr7 = {
            {
                    {10, 20, 30}, 
                    {40, 50, 60}
            },
            {
                    {10, 20, 30},
                    {40, 50, 60}
            }
    };
    

    private static void m1() {
        // 1차원 배열
        int[] arr = {100, 200, 300};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
        System.out.println();
        System.out.println();

        // 2차원 배열
        int[][] arr2 = new int[2][3];  //2(이차원,행) , 3(1차원,열)

        arr2[0][0] = 100;
        arr2[0][1] = 200;
        arr2[0][2] = 300;

        arr2[1][0] = 400;
        arr2[1][1] = 500;
        arr2[1][2] = 600;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                System.out.println("arr["+i+"]["+j+"] = " + arr2[i][j]);

            }
        }
        System.out.println();
        System.out.println();

        // 3차원 배열
        int[][][] arr3 = new int[2][2][3]; // 2(3차원,동,면) , 2(2차원,층,행) , 3(1차원,호,열)

        arr3[0][0][0] = 300;
        arr3[0][0][1] = 300;
        arr3[0][0][2] = 300;

        arr3[0][1][0] = 400;
        arr3[0][1][1] = 500;
        arr3[0][1][2] = 600;


        arr3[1][0][0] = 700;
        arr3[1][0][1] = 800;
        arr3[1][0][2] = 900;

        arr3[1][1][0] = 1000;
        arr3[1][1][1] = 1100;
        arr3[1][1][2] = 1200;

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    System.out.println("arr3[" + i + "][" + j + "][" + k + "] = " + arr3[i][j][k]);

                }
            }
        }

        System.out.println(Arrays.deepToString(arr3));




    }
}
