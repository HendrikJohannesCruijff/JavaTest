package com.test.List_104;

public class MyStackMain {
    public static void main(String[] args) {
//배열 생성
        MyStack stack = new MyStack();

//추가
        System.out.println("===============push=============");
        stack.push("빨강");
        stack.push("노랑");
        stack.push("파랑");
        stack.push("주황");
        stack.push("검정");
        System.out.println(stack);

//읽기
        System.out.println("===============pop=============");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


//개수
        System.out.println("===============size=============");
        System.out.println(stack.size());

//확인
        System.out.println("===============peek=============");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.size());

//크기 조절
        System.out.println("===============trimToSize=============");
        stack.trimToSize();

//초기화
        System.out.println("===============clear=============");
        stack.clear();
        System.out.println(stack.size());
    }
}