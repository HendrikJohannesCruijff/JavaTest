package com.test.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex32_Array {
    public static void main(String[] args) {

        /*

        배열 , Array
         자료 구조
         자료형 > 참조형
         집합 > 집합 자료형 > 데이터를 여러개 저장할 수 있는 자료형
         같은 자료형 / 같은 성격 > 집합

        */
       // m1();
      //  m2();
      //  m3();
     //   m4();
     //   m5();
    //    m6();
     //   m7();
     //   m8();
     //   m9();
      //  m10();
      //  m11();
       // m12();
        m13();
    }

    private static void m13() {
        int[] nums = {5, 3, 1, 4, 2};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void m12() {
        //정렬
        //요소간의 크기 비교 > 재배치

        //1. 오름차순
        //  a.숫자 : 작은수 > 큰수
        // b.문자열: 문자코드값 순으로
        // c. 날짜시간 : 과거 > 미래

        //2. 내림차순
        //  a.숫자 : 큰수 > 작은수
        // b. 문자열 : 문자코드값 역순으로
        // c. 날짜시간 : 미래 > 과거

        //정렬 구현
        // 1. 개발자 구현
        // 2. JDK or Library 사용

        int[] nums = {5, 3, 1, 4, 2}; // 버블정렬
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) { //  부등호 방향따라 오름차순,내림차순

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

        }
            System.out.println(Arrays.toString(nums));

    }

    private static void m11() {
        int[] nums = new int[3];
        System.out.println(Arrays.toString(nums));
        int[] nums2 = {100, 200, 300};
        System.out.println(Arrays.toString(nums2));

        String[] names2 = {"홍길동", "아무개", "하하하"};
        System.out.println(Arrays.toString(names2));
    }

    private static void m10() {
        int[] arr = new int[3];
        System.out.println(arr[0]);

        // 배열 자동 초기화
        // 배열(참조형)은 생성 직 후에 자동으로 초기화가된다.
        // 초기화 규칙
        // 1. 정수배열 > 0으로 초기화
        // 2. 실수배열 > 0.0
        // 3. 문자배열 > \0
        // 4. 논리배열 > false
        // 5. 참조형배열 > null
        double[] nums2 = new double[3];  //[0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(nums2));

        char[] list1 = new char[3]; //[ ,  ,  ]
        System.out.println(Arrays.toString(list1));

        boolean[] list2 = new boolean[3]; //[false, false, false]
        System.out.println(Arrays.toString(list2));

        String[] list3 = new String[3]; //[null, null, null]
        System.out.println(Arrays.toString(list3));
    }

    private static void m9() {
        // 유틸리티 클래스
        // int > Integer
        // double > Double

        // Arrays 클래스
        // 배열 유틸리티 클래스

        int[] nums = {111, 222, 333};


       int[] copy;
        copy = Arrays.copyOfRange(nums, 0, nums.length);
        nums[0] = 1000;

    }


    private static void m8() {
        // 배열복사
        // 1. 얕은 복사 , Shallow Copy
        // 2. 주소값 복사
        // Side Effect 발생

        //2. 깊은 복사 , Deep Copy
        // 요소 복사
        // Side Effect 없음
        int[] nums = new int[3];
        nums[0] = 100;
        nums[1] = 200;
        nums[2] = 300;

        int[] copy = new int[3];
        for (int i = 0; i < nums.length; i++) {
            copy[i] = nums[i];
        }
        nums[0] = 1000;
        System.out.println("copy[0] = " + copy[0]);
        System.out.println("nums[0] = " + nums[0]);

    }

    private static void m7() {

        // 값형 복사 > Side Effect가 발생하지 않는다.

        int a=10;
        int b;

        b=a;
        a = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int[] nums = new int[3];
        nums[0] = 100;
        nums[1] = 200;
        nums[2] = 300;

        int[] copy;

        // ******배열 변수끼리의 복사는 주소값 복사이다

        copy = nums;
        //***** nums와 copy는 같은 주소값이기 때문에 > 둘중하나만 바꿔도 다른 배열도 영향을 받는다
        // Side Effect가 발생한다 > 주의!!! 매우중요
        nums[0] = 1000;
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("copy[0] = " + copy[0]);
        // 개발자가 만드는 모든 지역변수는 stack에 생성된다. / new로 생성하는것들은 heap에 생성된다.

    }


    private static void m6() {
        // 배열의 길이는 런타임 때 결정할수있디
        Scanner sc = new Scanner(System.in);

        System.out.println("학생수 입력 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.println(arr.length);
    }

    private static void m5() {
        // 배열은 처음부터 사용하는 최대 길이를 미리 예측해서 정해야함 > 수정이 불가능

        int[] nums = new int[3];

        nums[0] = 100;
        nums[1] = 200;
        nums[2] = 300;

    }

    private static void m4() {
        long[] list = new long[5];
        list[0] =100;
        System.out.println(list[0]);
        //실수 배열(float , double)
        double[] list2 = new double[5];
        list2[0] = 3.14;
        System.out.println(list2[0]);

        // 문자 배열(char)
        char[] list3 = new char[5];
        list3[0] = 'A';
        System.out.println(list3[0]);

        // 논리 배열(boolean)
        boolean[] list4 = new boolean[5];
        list4[0] = true;
        System.out.println(list4[0]);

        String[] list5 = {"홍길동"};
        System.out.println(list5[0]);

        // Calendar c1;
        Calendar[] list6 = new Calendar[5]; // 캘린더 저장변수 x 5개 생성 > o
        list6[0] = Calendar.getInstance();  // < 요렇게해야함  캘린더 객체자체를 생성해서 넣어야함
        System.out.printf("%tF\n", list6[0]);
    }

    private static void m3() {
        int[] nums = new int[20];
        // ArrayIndexOutBoundsException < 배열길이를 넘어서넣음

        for (int i = 0; i < nums.length; i++) {
            nums[i] =i+1;
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void m2() {
        // 배열 선언하기(생성하기)
        // 자료형[] 배열명 = new 자료형[길이];
        int[] kors = {100, 90, 80};

        System.out.println(kors.length);

        int total = kors[0] + kors[1] + kors[2];

        double avg = total / 3.0;

         total = 0;

        for (int i = 0; i < kors.length; i++) {
            total += kors[i];
        }
        System.out.printf("총점 : %d점 , 평균: %.1f점\n", total, avg);


    }

    private static void m1() {
        // 요구사항] 학생 3명 > 국어점수 > 총점 , 평균
        // 추가사항] 학생수 증가 > 300명

        int kor1 = 100, kor2 = 90, kor3 = 80;

        int total = kor1 + kor2 + kor3;

        double avg = total / 3.0;

        System.out.printf("총점 : %d점 , 평균: %.1f점\n", total, avg);

    }
}
