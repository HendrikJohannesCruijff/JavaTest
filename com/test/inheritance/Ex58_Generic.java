package com.test.inheritance;

public class Ex58_Generic {
    public static void main(String[] args) {

        Item<Integer> item = new Item();
        item.setA(30);
        System.out.println(item.getA());

        Item<String> sItem = new Item<>();
        sItem.setA("daf");
        System.out.println(sItem.getA());

        Note<String, Integer> note = new Note<>("가나다", 123);

        System.out.println(note.getA());
        System.out.println(note.getB());

        Wrap<Integer> n3 = new Wrap<>(234);
        System.out.println(n3);
        System.out.println(n3.getData() * 2);

        Wrap<String> s3 = new Wrap<>("이순신");
        System.out.println(s3);
        System.out.println(s3.getData().length());
        System.out.println();


    }
}

// 제네릭 클래스
// T: 타입변수 (메서드의 매개변수 역할) > 반드시 참조형
// <> : 인자 리스트(메서드의() 역할
class Item<T> {

    private T a;
    private T b;

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }
}

class Note<T, U> {

    public T a;
    public U b;

    public Note(T a, U b) {
        this.a = a;
        this.b = b;
    }

    public T getA(){
        return a;
    }
    public U getB(){
        return b;
    }
}
class Wrap<T>{

    private T data;

    public Wrap(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Wrap{" +
                "data=" + data +
                '}';
    }
}



