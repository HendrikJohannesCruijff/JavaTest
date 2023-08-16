package com.test.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.function.*;

public class Ex73_Lambda {
    public static void main(String[] args) {


        /*

            람다식, Lambda Expresstion
            - 함수형 프로그래밍  > 지원
            - 자바 > 람다식 3 > 컬렉션 조작 ( = 스트림)
            - 람다식을 사용하면 코드가 간결해진다.
            - 자바의 메서드 > 다른(간결한) 표현
            - 람다식은 매개변수를 가지는 코드블럭이다 (=메서드)

            람다식 형식
            - 인터페이스 변수 = 람다식;
            ex) MyInterface m1 ;

            - (매개변수) -> {실행코드}
            - 자바의 메서드의 다른 표현
            - a.(매개변수) : 메서드의 매개변수 리스트와 동일
            - b. -> 화살표(Arrow), 코드블럭 호출역할
            - c. {실행코드} : 메서드의 구현부와 동일


        */

    //  m1();

     //   m2();
        m3();
    }

    private static void m3() {
        // 1. 파일 읽기
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\파일_입출력_문제\\성적.dat"));

            ArrayList<StudentTest> list = new ArrayList<>();




            String line = null;

            while ((line = reader.readLine()) != null) {

                String[] temp = line.split(",");
                StudentTest s = new StudentTest(temp[0],Integer.valueOf(temp[1]),Integer.valueOf(temp[2]),Integer.valueOf(temp[3]));

                list.add(s);

            }
            Comparator<StudentTest> c = (a, b) -> b.getTotal() - a.getTotal();

            list.sort(c);

            for (StudentTest s : list) {
                System.out.println(s.getName() + ":" + s.getTotal());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void m2() {

        //람다식 활용 == 익명 클래스(객체) 활용

        Random rnd = new Random();

        System.out.println(rnd.nextInt()); // 0~9

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(rnd.nextInt(10) + 1);
        }

        System.out.println(nums);
        Comparator<Integer> c = (o1, o2) -> o2.compareTo(o1);

        nums.sort(c);
        System.out.println("정렬후 = " + nums);


    }

    private static void m1() {
        // 요구사항] MyInterface를 구현한 객체를 1개 만드시오.
        MyInterface m = (a, b) -> a > b ? a : b;
        int result =  m.max(9, 4);
        System.out.println(result);

        MyInterface2 a = () -> System.out.println("안녕하세요");
        a.test();

        Supplier<String> s = () -> "Supplier"; // 매개변수 X , 갑 반환 O
        System.out.println(s.get());


        Consumer<Integer> c = i -> System.out.println(i + ","); // 매개변수 O , 반환 X
        c.accept(5);

        Predicate<Integer> p = i -> i % 2 == 0; // 매개변수O , 반환타입 boolean

        System.out.println(p.test(6));


        Function<String, Integer> f = i -> Integer.valueOf(i); // 매개변수를 받아서 변환작업을하고 반환하는 인터페이스

        System.out.println(f.apply("5"));


        UnaryOperator<Integer> square = num -> num * num;  //d 하나의 타입을 입력받아 동일한 타입의 결과를 반환

        System.out.println("square.apply(3) = " + square.apply(3));

        BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2; // 매개변수를 두개받아서 같은타입으로 반환

        System.out.println("sum.apply(5,6) = " + sum.apply(5, 6));

        BiFunction<Integer, Integer, Double> divide = (num1, num2) -> (double) num1 / num2; // 매개변수 두개를받아  다른타입으로 변환

        System.out.println("divide.apply(10,5) = " + divide.apply(10, 5));
    }


}

class StudentTest {
    private String name;
    private int kor , eng , math;

    public StudentTest(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public int getTotal(){
        return kor + eng + math;
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
        return "StudentTest{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}'+"\n";
    }
}

@FunctionalInterface
interface MyInterface2{
    void test();
}

@FunctionalInterface
interface MyInterface {
    int max(int a, int b);
}
