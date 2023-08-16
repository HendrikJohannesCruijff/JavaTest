package com.test.collection;

import java.util.TreeMap;

public class Ex72_TreeMap {
    public static void main(String[] args) {



        /*

        TreeMap
         Tree > 이진 탐색 트리 > 자동 정렬
         Map > 키+값 > 연관 배열



        */

        TreeMap<String, String> map = new TreeMap<>();
        map.put("white", "흰색");
        map.put("black", "검정");
        map.put("red", "빨강");
        map.put("yellow", "노랑");
        map.put("blue", "파랑");
        map.put("orange", "주황");
        map.put("green", "초록");

        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.get("green"));

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.headMap("white")); // white 전까지만
        System.out.println(map.tailMap("white")); // white 부터
        System.out.println(map.subMap("blue", "red")); //앞에거포함 뒤에건 x


        /*
            List
             - ArrayList > 배열이 필요할 때 / 삽입 , 삭제x *********
             - LinkedList > ArrayList 대체제 / 삽입 , 삭제(O)
             - Stack > 스택구조필요
             - Queue > 큐 구조 필요
             - Vector

             Set
             - HashSet > 중복값 배제 , 유일한 집합 *****
             - TreeSet > HashSet + 정렬

             Map
             - HashMap > 키/값 연관 배열이 필요할때 ***************
             - TreeMap > HashMap + 정렬
             - HashTable

             -Properties > JSON , XML





        */
    }
}
