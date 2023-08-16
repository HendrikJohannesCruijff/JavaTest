package com.test.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Ex62_Map {


    /*

    ArrayList
    -  요소접근 > index 사용
    - 순서가 있는 데이터 집합(방번호==요소의 순서)
    ex) 강의실 6개 > 1강의실 , 2강의실 , 3강의실 ,
     - 스칼라 배열(Scalr Array)
     - 요소 일관 접근 > 루프(for)
     - 요소끼리 구분이 힘들다 > 방번호 > 의미가없다
     - 첨자(index)는 유일하다
     - 값(Value)은 중복이 가능하다.> 방번호가 유일해서..

    HashMap
    - 요소 접근 > 키(Key) 사용
    - 순서가 없음 (index) 없음
    ex) 강의실 6개 > 햇님반 , 달님반 , 별님반... 지구반
    - 키(key) -> 값(value)
    - 맵(Map) , 딕셔너리(Dictionary) = 사전구조
    - 연관 배열
    - 요소 일관 접근 > 불가능
    - 요소끼리 구분이 용이하다. > 식별자(key) > 방의 의미 > 가독성
    - 키(key)는 유일하다.
    - 값(value)은 중복이 가능하다. > 키가 유일해서

    */
    public static void main(String[] args) {
        //key   , value
        HashMap<String, Integer> map = new HashMap<>();

        // 1.요소 추가
        // V put(K key, V value)

        map.put("국어", 100);
        map.put("영어", 90);
        map.put("수학", 80);


        // 2. 요소 개수
        // int size()
        System.out.println(map.size());

        // 3. 요소 개수
        // - V get(k key)
        System.out.println("map.get(국어) = " + map.get("국어"));
        System.out.println("map.get(수학) = " + map.get("수학"));
        System.out.println("map.get(영어) = " + map.get("영어"));

        // 4. 일괄 탐색 > 불가능 > 존재 o

        // 5. 요소수정
        // V put (K key, V value)
        map.put("국어", 95); // 해당 키를 덮어씌우기
        System.out.println(map);

        // 6. 요소 검색
        // - boolean containsKey(K key)   / 해당키가 map에 있으면 true 없으면 false
        // - boolean containsValue(V value)
        System.out.println(map.containsKey("국어"));
        System.out.println(map.containsKey("국사"));

      // - boolean containsValue()  / 해당 value가 있으면 true , 없으면 false
        System.out.println(map.containsValue(90));

        // 7.요소 삭제
        // - V remove (K key)
        map.remove("국어");

        System.out.println(map.size());
        System.out.println(map.get("국어"));

        // 8 초기화
        map.clear();
        System.out.println(map.size());




        // ket , value 값 꺼내일기

        map.put("국어", 100);
        map.put("영어", 90);
        map.put("수학", 80);

        Set<String> set = map.keySet();
        System.out.println(set);

        for (String key : set) {   // 향상된 for문으로 맵의 key,value 값 꺼내오기
            System.out.println(key+" "+map.get(key));

        }


        //교실
        HashMap<String, String> list = new HashMap<>();

        list.put("반장", "홍길동");
        list.put("부반장", "아무개");
        list.put("미화부장", "하하하");

        System.out.println(list);

    }
}
