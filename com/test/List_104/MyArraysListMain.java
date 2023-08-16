package com.test.List_104;

public class MyArraysListMain {
    public static void main(String[] args) {
        //배열 생성
        MyArrayList list = new MyArrayList();

//추가
        list.add("홍길동");
        list.add("아무개");
        list.add("하하하");
        System.out.println(list);

//읽기
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

//개수
        System.out.println(list.size());

//탐색 + 읽기
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

//수정
        System.out.println("=======================set====================");
        list.set(0, "우하하");
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.getIndex() = " + list.getIndex());

//삭제
        System.out.println("======================remove====================");
        list.remove(1);
        System.out.println(list);
        System.out.println("list.getIndex() = " + list.getIndex());


//삽입
        System.out.println("======================add=======================");
        list.add(1, "호호호");
        System.out.println(list);





//검색
        System.out.println("======================indexOf=======================");
        if (list.indexOf("홍길동") > -1) {
            System.out.println("홍길동 있음");
        } else {
            System.out.println("홍길동 없음");
        }

//초기화
        list.clear();
        System.out.println(list.size());


    }
}
