package com.test.List_104;

public class MyHashMapMain {
    public static void main(String[] args) {
        //배열 생성
        MyHashMap map = new MyHashMap();

//추가
        System.out.println("===========put==========");
        map.put("국어", "합격");
        map.put("영어", "불합격");
        map.put("수학", "보류");
        System.out.println(map);

//읽기
        System.out.println("===========get==========");
        System.out.println(map.get("국어"));
        System.out.println(map.get("영어"));
        System.out.println(map.get("수학"));


//개수
        System.out.println("===========size==========");
        System.out.println(map.size());

//수정
        System.out.println("===========put==========");
        map.put("영어", "합격");
        System.out.println(map.get("영어"));

//삭제
        System.out.println("===========remove==========");
        map.remove("영어");
        System.out.println(map.get("영어"));


//검색(key)
        System.out.println("===========containsKey==========");
        if (map.containsKey("국어")) {
            System.out.println("국어 점수 있음");
        } else {
            System.out.println("국어 점수 없음");
        }

//검색(value)
        System.out.println("===========containsValue==========");
        if (map.containsValue("합격")) {
            System.out.println("합격 과목 있음");
        } else {
            System.out.println("합격 과목 없음");
        }

//초기화
        System.out.println("===========clear==========");
        map.clear();
        System.out.println(map.size());
    }
}