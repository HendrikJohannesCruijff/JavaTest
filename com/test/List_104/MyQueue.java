package com.test.List_104;

import java.util.Arrays;

public class MyQueue {

    private    String[] list;

    private int index;
    boolean add(String value) {
        try {
            if (list == null) {
                list = new String[1];
            }

            if (check()) {
                doubleList();
            }

            list[index] = value;
            index++;
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean check(){
        if (index == list.length) {
            return true;
        }
        return false;
    }

    public void doubleList(){
        String[] temp = new String[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        list = temp;

    }



    String poll() {  // list=[빨강, 노랑, 파랑, 주황, 검정]
        String result = list[0];

        for (int i = 0; i < index-1; i++) { // [노랑, 파랑, 주황, 검정 , 검정]
            list[i] = list[i+1];
        }
        String[] temp = Arrays.copyOfRange(list, 0, index- 1);

        list = temp;
        index--;

        return result;
    }

    int size(){
        return index;
    }

    String peek() {
        return list[0];
    }

    void clear(){
        list = new String[1];
        index = 0;
    }

    void trimToSize(){

    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "list=" + Arrays.toString(list) +
                ", index=" + index +
                '}';
    }
}
