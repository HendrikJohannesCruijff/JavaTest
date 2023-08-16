package com.test.obj;

public class Ex37_class {
    public static void main(String[] args) {
        User user = new User();

        user.age = 20;
        user.name = "홍길동";
        user.hello();
        System.out.println(user.getAge());
        System.out.println(user.getName());

        User user2 = new User();
        user2.name = "아무개";
        user2.age = 22;
        user2.hello();

        // 행동 클래스 > 객체를 여러개 생산하지 않는다 밑에처럼 안함
        MyMath myMath = new MyMath();

        myMath.add(10, 20);
        myMath.substract(100, 50);

        MyMath m2 = new MyMath();

        m2.add(10, 20);
        m2.substract(100, 50);
    }
}

// 클래스(객체) = 데이터 + 행동
// 클래스(객체) = 맴버 변수

class User {
    // 클래스 맴버
    // 1. 변수
    // 2. 메서드


    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 클래스 맴버 메서드 > 호출되는 객체에 따라 다른 결과 발생
    // *************클래스 맴버 메서드는 되도록(필수) 맴버 변수를 활용해서 활동을 해야한다.
    public void hello() {
        System.out.println("hello 저는 " + name + "입니다. ");
    }

}

class MyMath{
    //개성이 없는 메서드 > 객체간의 행동 구분 불가능   / 거의잘 안만듬
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void substract(int a, int b) {
        System.out.println(a - b);
    }
}
