package com.test.obj;

public class Person {

    private String name;
    private int age;
    private String gender;

    private Person father; //아빠
    private Person mother; // 엄마

    public void setFather(Person father) {
        this.father = father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
public String info(){
    String temp = " ";
    temp += "아빠" + father.getName() + "\n";
    temp += "엄마" + mother.getName() + "\n";
    temp += "본인" + this.getName() + "\n";

    return temp;
}

}
