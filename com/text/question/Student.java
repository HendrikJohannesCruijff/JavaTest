package com.text.question;

public class Student {

    private String name;
    private int age;
    private int grade;
    private int classNumber;
    private int number;

    public Student(){
        this.name = "미정";
    }

    public Student(String name, int age, int grade, int classNumber, int number) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.classNumber = classNumber;
        this.number = number;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int grade, int classNumber, int number) {
        this.name = "미정";
        this.grade = grade;
        this.classNumber = classNumber;
        this.number = number;
    }

    public String info() {

        return String.format("%s(나이 : %s , 학년 : %s , 반 : %s , 번호 : %s)"
                , name, age != 0 ? age + "세" : "미정", grade != 0 ? grade + "학년" : "미정", classNumber != 0 ? classNumber + "반" : "미정"
                , number != 0 ? number : "미정");
    }
}
