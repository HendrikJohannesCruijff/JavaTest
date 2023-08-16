package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex60_List {
    public static void main(String[] args) {


        /*

            컬렉션, collection
            - collection Framework
            - (향상된)배열
            -기존의 순수 배열
                - 사용법 개량
                - 용도에 따른 방식/효율성 개량
            - 클래스 + 내부 순수 배열
            - 길이 가변 > 방의 개수를 마음대로 늘리고 줄이는게 가능
            - 자료 구조

            컬렉션 종류
            1. List
                -ArrayList(*******)
                -LinkedList
                -Queue
                -Stack
                -Vecter(Legacy)
            2. Set
                -HashSet(***)
                -TreeSet

            3. Map
                -HashMap(******)
                -TreeMap
                -Properties(Legacy)
                -HashTable(Legacy)


           Collerction
           -List
           _Set

           Map()

           ArrayList 클래스
            - 순수 배열과 구조가 가장 유사함
            - 첨자(index)를 사용해서 요소에 접근
            -
        */
     //   m1();
      //  m2();
     //   m3();
      //  m4();
     //   m5();

        m6();
    }

    private static void m6() {
        // 컬렉션 초기 용량 > 내부 배열의 초기 길이
        ArrayList<Integer> list = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {

            list.add(i);
        }
        System.out.println(list);





    }

    private static void m5() {
        // ArrayList 특징
        // 1. 내부에 배열을 가지고 있다.
        // 2. ArrayList 클래스의 대부분의 기능이 내부 배열을 조작하는 기능으로 구성
        // 3. ??? 길이가 가변 > 데이터를 계속 넣으면 공간이 늘어난다.

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        System.out.println(list.size());

        list.add(10);
        System.out.println(list.size());
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.size());

        list.add(50);
        System.out.println(list.size());
    }

    private static void m4() {
        //성적표
        //학생(이름 , 국어 , 영어 , 수학, 총점 , 평균)
        //
        ArrayList<Student> list = new ArrayList<>();

        //선택?
        // - 길이로 판단
        // 배열(불변) vs Arraylist(가변)

        for (int i = 0; i < 10; i++) {
            int kor = (int) (Math.random() * 41)+60;
            int eng = (int) (Math.random() * 41)+60;
            int math = (int) (Math.random() * 41)+60;

            Student s = new Student("학생" + (i+1), kor, eng, math);

            list.add(s);


        }
        System.out.println("==============================================");
        System.out.println("                    성적표");
        System.out.println("==============================================");
        System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");

        for (Student x : list) {
            int total = x.getKor() + x.getKor() + x.getMath();
            double avg = total / 3.0;
            System.out.printf("%s\t%3d\t%7d\t%7d\t%8d\t%.1f\n"
                    , x.getName(), x.getKor(), x.getKor(), x.getMath(), total, avg);

        }

    }

    private static void m3() {
       //차원
        int[] ns1 = new int[3];
        int[][] ns2 = new int[2][3];
        int[][][] ns3 = new int[1][2][3];

        ArrayList<Integer> ms1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ms2 = new ArrayList<>();
        ArrayList<ArrayList<ArrayList<Integer>>> ms3 = new ArrayList<>();




    }

    private static void m2() {
        // 1. 요소 추가하기
        // - boolean add(T value)

        ArrayList<String> list = new ArrayList<>(Arrays.asList("바나나", "딸기", "사과", "귤", "파인애플"));

        // int size()
        System.out.println(list.size());

        // 3. 요소 접근(읽기)
        // T get(int index)
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));

        // 4. 요소 수정
        // list[0] = 10; 대입 or 수정
        // String set(int index, T newValue)
        System.out.println(list);
        System.out.println("사과 -> 포도 ");
        list.set(2, "포도");
        System.out.println(list);

        // CRUD
        // Create(쓰기)
        // Read(읽기)
        // Update(수정)
        // Delete(삭제)

        //5. 요소 삭제
        // 컬렉션은 요소 삭제?> 가능
        // T remove(int index)  // 방번호 찾아서 삭제
        // boolean remove(T value)  // 값을 찾아서 삭제

        System.out.println("포도 -> 삭제");
        list.remove(2);
        System.out.println(list);
        System.out.println("귤 -> 삭제");
        list.remove("귤");  // if.. 귤이 두개이상이면? 첫번째 만나는 귤 삭제 그래서 잘안쓴다네여
        System.out.println(list);

        //6. 탐색
        // - 루프
        for (String x : list) {
            System.out.println(x);
        }

        //8. 요소 추가
        // 배열의 원하는 위치에 요소 추가
        //
        list.add(1, "망고");
        System.out.println(list);

        // 9.기타 등등
        System.out.println("list.indexOf(딸기) = " + list.indexOf("딸기"));
        System.out.println("list.lastIndexOf(파인애플) = " + list.lastIndexOf("파인애플"));
        System.out.println("list.contains(망고) = " + list.contains("망고"));

        //10
        System.out.println("list.isEmpty() = " + list.isEmpty()); // 비어있는지확인

        list.clear(); // 다삭제

        System.out.println("list.isEmpty() = " + list.isEmpty());

    }

    private static void m1() {
        // 순수 배열
        // 타입 명시
        // 길이 명시
        int[] num1 = {10, 20, 30};

        // 요소 접근 > 첨자(index) 사용

        System.out.println(num1[0]);
        System.out.println(num1[1]);
        System.out.println(num1.length);

        // 컬렉션
        // 타입 명시 > 제네릭
        // 길이명시 > 가변
        List<Integer> list = new ArrayList<>();

        //요소 추가
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.set(1, 50);
        list.add(2, 60);
        System.out.println(list);
        System.out.println(list.size());

    }
}
