package com.test.collection;

import java.util.*;

public class Ex70_TreeSet {
    public static void main(String[] args) {

        /*

            TreeSet
            -Tree 구조 > 이진 트리 구조(Binary Search Tree)
            - 자동 정렬

            -Set 사용법


            Set
            - 순서가 없다.
            - 중복값을 가지지 않는다.

        */

        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        hashSet.add(20);
        hashSet.add(70);
        hashSet.add(40);
        hashSet.add(10);
        hashSet.add(80);

        treeSet.add(20);
        treeSet.add(70);
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(80);

        System.out.println(hashSet);
        System.out.println(treeSet);

        Iterator<Integer> iter = hashSet.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(30)); // 해당숫자미만
        System.out.println(treeSet.tailSet(30)); //해당숫자 이상
        System.out.println(treeSet.subSet(20, 40)); // 20 이상 40미만
        System.out.println();
        HashSet<Integer> set3 = new HashSet<>();

        set3.add(20);
        set3.add(50);
        set3.add(30);
        set3.add(10);
        set3.add(40);

        System.out.println(set3);

        ArrayList<Integer> list = new ArrayList<>(set3); // Set을 정렬하는방법

        Collections.sort(list);

        System.out.println(list);


    }
}
