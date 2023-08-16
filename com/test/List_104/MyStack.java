package com.test.List_104;

import java.util.Arrays;

public class MyStack {

    private   String list[];
    private int index;


    boolean push(String value){
        try {
            if (list == null) {
                list = new String[1];
            }
            if (check()) {
                increaseCapacity();
            }
            list[index] = value;
            index++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean check(){  // 배열에 공간이 있는지 true , false로 확인
        return list.length == index;
    }

    private void increaseCapacity(){ // 배열 용량증가
        String[] temp = new String[list.length+1];
        for (int i = 0; i < index; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }
    public String pop(){
        String result = list[index - 1];  // list 마지막 인덱스 값 result에 복사

        String[] temp = Arrays.copyOfRange(list, 0, index - 1);
        list = temp;
        index--;
        return result;
    }

    public String peek(){
        return list[index - 1];
    }

    public void clear(){
        list = new String[1];
        index = 0;

    }
    public void trimToSize(){

    }

    public int size(){
        return index;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "list=" + Arrays.toString(list) +
                ", index=" + index +
                '}';
    }
}