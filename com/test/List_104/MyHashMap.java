package com.test.List_104;

import java.util.Arrays;

public class MyHashMap {
    private String[] keyList ;
    private String[] valueList;
    private int index;

    public void put(String key, String value) {
        if (keyList == null && valueList == null) {
            keyList = new String[1];
            valueList = new String[1];
        }
        for (int i = 0; i < index; i++) {
            if (keyList[i].equals(key)) { // 같은 key 가 있으면
                valueList[i] = value;
                return;// 덮어씌우기
            }
        }
        if (check()) {
            increaseCapacity();
        }

        keyList[index] = key;
        valueList[index] = value;
        index++;
    }

    private boolean check(){
        return(keyList.length == index) && (valueList.length == index);
    }

    private void increaseCapacity(){
        String[] keyTemp = new String[index + 1];
        String[] valueTemp = new String[index + 1];

        for (int i = 0; i < index; i++) {
            keyTemp[i] = keyList[i];
            valueTemp[i] = valueList[i];
        }
        keyList = keyTemp;
        valueList = valueTemp;
    }

    public String get(String key) {
        String result = null;
        for (int i = 0; i < index; i++) {
            if ((keyList[i].equals(key))) {
                result = valueList[i];
            }
        }

        return result;
    }

    public void remove(String key) {
        for (int i = 0; i < index; i++) {
            if (keyList[i].equals(key)) {  // 매개변수로 들어온 key 가 keyList에 있는지확인
                removeKeyValue(i); // 있으면 해당 key의 인덱스를  removeKeyValue 메서드의 매개변수에 넣어줌
            }
        }
    }

    private void removeKeyValue(int num){
        for (int i = num; i < index-1; i++) {   // 해당 인덱스 key의 뒤에값들을 앞으로 땡기면서 덮어씌우기
            keyList[i] = keyList[i+1];
            valueList[i] = valueList[i+1];
        }
        keyList[index - 1] = null;   // 마지막인덱스 값 =  null
        valueList[index - 1] = null;
        index--;

    }

    public boolean containsKey(String key) {
        for (int i = 0; i < index; i++) {
            if (keyList[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(String value){
        for (int i = 0; i < index; i++) {
            if (valueList[i].equals(value)) {
                return true;
            }
        }
        return false;
    }


    public void clear(){
        keyList = new String[1];
        valueList = new String[1];
        index = 0;
    }


    public int size(){
        return index;
    }



    @Override
    public String toString() {
        return "MyHashMap{" +
                "keyList=" + Arrays.toString(keyList) +
                ", valueList=" + Arrays.toString(valueList) +
                ", index=" + index +
                '}';
    }
}
