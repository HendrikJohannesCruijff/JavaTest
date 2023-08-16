package com.test.obj;

import java.util.Scanner;

public class Ex44_static {
    /*
           1. 클래스 로딩, Class Loading
           - 프로그램을 실행하기 전에 클래스의 정의를 미리 읽는 작업
           - 클래스의 정의를 메모리에 얹는 작업
           - 클래스의 로딩 과정에서 모든 static 키워드 인식 > 메모리 실체화(구현)

    */
    public static void main(String[] args) {

        /*

            static 키워드
            - 클래스 or 클래스 맴버 앞에 가능





        */
        //상황] 학생 3명
        // -"역삼 중학교"

        Student s1 = new Student();
        s1.setName("홍길동");
        s1.setAge(15);
        Student.setSchool("역삼 중학교");

        Student s2 = new Student();

        s2.setName("아무개");
        s2.setAge(15);


        Student s3 = new Student();
        s3.setName("이순신");
        s3.setAge(16);

        System.out.println(s1.info());
        System.out.println(s2.info());
        System.out.println(s3.info());

        System.out.println("===============================");


        System.out.println(Util.add(5, 6));
    }
}

class Student {

    private String name;
    private int age;
    private static String school; //** 정적변수,클래스변수 , 공유변수

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

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {  // static 맴버의 Setter
        Student.school = school;
    }

    public String info(){
        return String.format("%s(%d) %s", name, age, school);
    }
    public void aaa(){
        // just 메서드는 다작업가능
        System.out.println(name);
        System.out.println(school);
    }
    public static void bbb(){ // static 메서드에선 그냥 인스턴스변수는 못쓴다?
  //      System.out.println(this.name);
    }
}
class Util{

    public static int add(int a, int b) {
        return a+b;
    }

}

class Phone{

    private  String color;
    private String number;
    public int size;

    private static int weight;
    private static int battery;

    public Phone() {
    }

    public Phone(String color, String number) {
    }

    private String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Phone.weight = weight;
    }

    public static int getBattery() {
        return battery;
    }

    public static void setBattery(int battery) {
        Phone.battery = battery;
    }
}