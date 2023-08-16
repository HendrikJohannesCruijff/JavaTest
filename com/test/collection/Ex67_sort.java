package com.test.collection;

import java.util.*;

public class Ex67_sort {

    public static void main(String[] args) {


        //배열 or 컬렉션
        // - 오름차순 정렬 , 내림차순 정렬
        // 1. 직접 알고리즘 구현
        // 2. JDK 제공 기능


        // 2+1  > JDK 제공 + 커스터마이징 + 익명 클래스 사용(선택이라 말하고 필수라쓴다)


      //  m1();
       // m2();
      //  m3();
      //  m4();
        m5();

    }

    private static void m5() {
       // 컬렉션의 정렬
        // 1. ArrayList > O
        // 2. HashMap > X
        // 3. Queue > X
        // 4. Stack > X
        // 5. HashSet > X

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));

        }
        //Collections.sort(list, Collections.reverseOrder()); // 역순정렬
        list.sort(Collections.reverseOrder());  // 리스트에도  sort를 사용할수있다?


        System.out.println(list);

    }

    private static void m4() {
        //객체 정렬
        Score[] list = new Score[5];

        list[0] = new Score("홍길동", 100, 90, 80);
        list[1] = new Score("아무개", 10, 80, 70);
        list[2] = new Score("유재석", 70, 60, 50);
        list[3] = new Score("박명수", 50, 40, 30);
        list[4] = new Score("이순신", 30, 20, 10);

        System.out.println(Arrays.toString(list));

        //이름순으로
        Comparator<Score> c = (a, b) -> a.getName().compareTo(b.getName());  // 이름순으로 정렬하기

        Comparator<Score> c2 = (a, b) -> a.getKor() - b.getKor(); // 국어순으로 정렬

        Comparator<Score> c3 = (a, b) -> (a.getKor() + a.getKor() + a.getMath())
                - (b.getKor() + b.getEng() + b.getMath()); // 평균순으로 비교 (낮은순부터)


        Arrays.sort(list, c3);
        System.out.println(Arrays.toString(list));

    }

    private static void m3() { // 날짜 순서 정렬하기
        Calendar[] dates = new Calendar[5];


        for (int i = 0; i < dates.length; i++) {
            dates[i] = Calendar.getInstance();
        }
        dates[0].add(Calendar.DATE, 7);
        dates[1].add(Calendar.DATE, -2);
        dates[2].add(Calendar.DATE, 1);
        dates[3].add(Calendar.DATE, 0);
        dates[4].add(Calendar.DATE, 3);

        for (int i = 0; i < dates.length; i++) {
            System.out.printf("%tF\n", dates[i]);
        }
        System.out.println();

        Arrays.sort(dates);
        for (int i = 0; i < dates.length; i++) {
            System.out.printf("%tF\n", dates[i]);
        }


        System.out.println();
        Comparator<Calendar> c = (a, b) -> b.compareTo(a); // 역순 정렬
        Arrays.sort(dates, c);

        for (int i = 0; i < dates.length; i++) {
            System.out.printf("%tF %tA\n", dates[i], dates[i]);
        }


    }


    private static void m2() {
        //자료형별 정렬
        // 1. 숫자
        // 2. 문자(열) > 문자코드값
        // 3. 날짜시간 > 숫자


        String[] names = {"홍길동", "아무개", "유재석", "박명수", "이순신", "훈", "김철"};

        String txt1 = "aaa";
        String txt2 = "bbb";

        System.out.println(txt2.compareTo(txt1));

        Comparator<String> s = (a, b) -> a.compareToIgnoreCase(b); // 대소문자 구문x

        Arrays.sort(names, s);
        System.out.println(Arrays.toString(names));

        Comparator<String> s2 = (a, b) -> b.compareToIgnoreCase(a); // 역순

        Arrays.sort(names, s2);
        System.out.println(Arrays.toString(names));

        Comparator<String> s3 = (a, b) -> a.length() - b.length(); //  글자수 비교

        Arrays.sort(names, s3);

        System.out.println(Arrays.toString(names));




    }

    private static void m1() {
        //int[] nums
        Integer[] arr = {1, 5, 2, 4, 3};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //내림차순
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

        Arrays.sort(arr, new MyComparator());
        System.out.println(Arrays.toString(arr));

        MyComparator m = new MyComparator();


        System.out.println(m.compare(10, 20));

        Double[] nums2 = {2.5, 7.1, 3.8, 9.2, 8.9};
        Arrays.sort(nums2, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                if (o1 < o2) {
                    return 1;
                } else if (o1 > o2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(nums2));

        Comparator<Double> c = (o1, o2) -> o1 == o2 ? 0 : o1 > o2 ? 1 : -1;

        Arrays.sort(nums2, c);
        System.out.println(Arrays.toString(nums2));
    }
}

//정렬때매 만든 클래스
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

        //o1 vs o2
        // 1. 오름차순
        // o1이 더크면 > 양수변환
        // o2가 더크면 > 음수변환
        // 같으면 > 0 변환

        // 2. 내림차순
        // o1 이 더크면 > 음수반환
        // o2 가 더크면 > 양수반환

        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        } else {
            return 0;
        }



    }
}

class Score {
    private String name;
    private int kor , eng , math;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return "Score{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}' + "\n";
    }
}
