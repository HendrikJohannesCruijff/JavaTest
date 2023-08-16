package com.test.List_104;

public class MySetMain {
    public static void main(String[] args) {
        //배열 생성
        MySet list = new MySet();

//추가
        list.add("홍길동");
        list.add("아무개");
        list.add("하하하");
        System.out.println(list);


//개수
        System.out.println(list.size());

//삭제
        list.remove("아무개");
        System.out.println(list);

//개수
        System.out.println(list.size());

//탐색 + 읽기
       while (list.hasNext()) {
            System.out.println(list.next());
        }


//초기화
        list.clear();
        System.out.println(list.size());


    }
}
