package com.test.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex61_Stack {
    public static void main(String[] args) {


        /*

            자료구조(컬렉션)
            -물리적인 특징(내부 구조)
            -추상적인 특징(사용법)


            List
            -ArrayList
            -Queue
            -Stack

            Stack
            -후입선출
            -LIFO
            -저장소에 나중에 들어간 요소가 가장 먼저 나온다.
            ex) 메모리 구조(Stack)
            ex) 되돌리기(Ctrl+z) , 다시하기(Ctrl+Y)

            Queue
            -선입선출
            -FIFO,First Input First Output
            -저장소를 먼저 들어간 요소가 먼저 나온다.
             ex) 줄서기
        */
      //  m1();
      //  getM2();
        m3();
    }

    private static void m3() {
        Queue<String> queue = new LinkedList<>();

        queue.add("짜장면");
        queue.add("짬뽕");
        queue.add("볶음밥");
        // 2.요소 개수
        // int size();
        System.out.println(queue.size());
        // 3. 요소 읽기(읽고 버리기 )
        System.out.println(queue.poll()); // poll도 읽고 삭제해서
        System.out.println(queue.size()); // 사이즈가 줄어든다

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());   // 애는 스택과다르게 읽어올게없어도 오류가 안나고 null이뜸

        if (!queue.isEmpty()) {  //읽어올 요소가 있을때만 꺼내오기
            System.out.println(queue.poll());
        }

        //5. 요소확인
        System.out.println(queue.peek()); // 순수하게 읽기만하기 ( 삭제는안함 )
    }

    private static void getM2() {
        Stack<String> stack = new Stack<>();
        stack.push("짜장면");
        stack.push("짬뽕");
        stack.push("볶음밥");
        // 5 요소확인  peek() 는  순수읽기 , 삭제는 안됨
        System.out.println(stack.peek());
        System.out.println(stack.size());  // 삭제가 안되었기에 크기는 그대로
        System.out.println(stack);

    }

    private static void m1() {
        Stack<String> stack = new Stack<>();

        //후입선출
        // T push(T value)
        stack.push("짜장면");
        stack.push("짬뽕");
        stack.push("볶음밥");

        // 2. 요소 개수
        // int size()
        System.out.println(stack.size());
        //3. 요소 읽기
        System.out.println(stack.pop()); // 후입선출이라 마지막에 넣었던 볶음밥이 나옴과 동시에 삭제됨

        System.out.println(stack.size()); // 데이터가 읽기와 동시에 삭제되서 사이즈가 줄어듬

        System.out.println(stack.pop());
        System.out.println(stack.size());
        

        // 4. 스택이 비었는지?
        if (!stack.isEmpty()) {
            System.out.println(stack.pop());

        }

    }
}
