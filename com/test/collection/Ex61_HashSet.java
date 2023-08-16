package com.test.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex61_HashSet {
    public static void main(String[] args) {


        /*

            1. List
                - 순서가 있는 데이터 집합
                - 첨자(방번호)
                - 데이터 중복을 허용
            2. Set
                - 순서가 없는 데이터 집합
                - 요소를 구분하는 식별자가 없다
                - 데이터 중복을 허용하지 않음
                -


            3. Map
                - 순서가 없는 데이터 집합
                - 키 + 값
                - 데이터 중복을 허용
                -

        */
    //    m1();
    //    m2();
        m3();
    }

    private static void m3() {
        HashSet<Person> set = new HashSet<>();

        set.add(new Person("홍길동", 20));
        set.add(new Person("아무개", 25));
        set.add(new Person("이순신", 23));

        set.add(new Person("홍길동", 20)); // 객체집어넣는건 예외인듯?

        System.out.println(set);

        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("홍길동", 20);

        System.out.println("p1.hashCode() = " + p1.hashCode());
        System.out.println("p2.hashCode() = " + p2.hashCode());


        String s1 = "홍길동";
        String s2 = "홍길동";
        String s3 = "홍";
        s3 += "길동";
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

    }

    private static void m2() {

        //중복값 제거 > 로또 번호 > 중복되지 않는 난수 생성

        //Case 1. ArraysList
   /*     ArrayList<Integer> lotto = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < 6; i++) {
            int n = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto.get(j) == n) {
                    flag = true;
                    break;
                }
                lotto.add(n);
            }
*/
            //Case 2 . Hashset

            HashSet<Integer> lotto2 = new HashSet<>();

            while (lotto2.size() < 6) {

               int a = (int) (Math.random() * 45) + 1;
                lotto2.add(a);
            }
            System.out.println(lotto2);

        for (int x : lotto2) {
            System.out.println(x);
        }

        // *** List , Set > Iterator 지원 > 탐색 도구
        Iterator<Integer> iter = lotto2.iterator();
        System.out.println(iter.hasNext());// 다음요소가있는지 확인 boolean
        while (iter.hasNext()) {
            System.out.println(iter.next()); // 다음요소 뽑기
        }
    }


    private static void m1() {

        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        list.add("강아지");
        list.add("고양이");
        list.add("거북이");

        set.add("강아지");
        set.add("고양이");
        set.add("거북이");

        System.out.println(list.size());
        System.out.println(set.size());

        System.out.println(list);
        System.out.println(set);

        list.add("고양이");
        System.out.println(list);

        set.add("고양이");  // 셋은 중복허용 X
        System.out.println(set);
        System.out.println(set.add("고양이")); // 중복값이라면 false나온다

        list.remove(1);
        list.remove("거북이");
        System.out.println(list);

        set.remove("거북이");
        System.out.println(list);

        System.out.println(set.contains("고양이"));
        
    }
}


class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 값이 동일하면 객체가 동일하게 처리
    // 1. hashCode() 오버라이드
    // 2. equals

    public int hashCode(){

        //원래 > 자신의 메모리 주소값 반환

        // p1 > "홍길동" , 20 > "홍길동20" > 100번지
        // p2 > "아무개" 25 > "아무개25" > 200번지
        //p3 > "홍길동",20 > 홍길동20 > 100번지
        return (name+age).hashCode();
    }

    public boolean equals(Object object) {
        return hashCode() == object.hashCode();
    }
}
