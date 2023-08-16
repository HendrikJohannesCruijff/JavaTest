package com.test.List_104;

import java.util.Arrays;

public class MyArrayList  {

    private String[] list;

    private int index;

    public int getIndex() {
        return index;
    }

    public MyArrayList() {
        this.index = 0;
    }

    public boolean add(String value) {
        try {

            if (index == 0) {
                list =  new String[1];
            }

            if (check()) {
                doubleList();
            }
                // 배열의 방이 남아 있는지? > 있으면.. / 없으면  두배로 늘리기

                list[index] = value;

            index++;
            return true;
        } catch (Exception e) {
        return  false;
        }
}
public boolean check(){ // 배열크기가 다찼는지 확인 메서드
    if (index == list.length) {
        return true;
    }
    return false;
}

public void doubleList(){ // 배열 크기 늘려주는 메서드
    String[] temp = new String[list.length + 1];
    for (int i = 0; i < list.length; i++) {
        temp[i] = list[i];
    }
    list = temp;
}



    public void add(int index, String value) { // list.add(1, "호호호");

            if (check()) {
                doubleList();
            }
            for (int i = this.index; i > 0; i--) {
                list[i] = list[i - 1];
            }

            list[index] = value;
            this.index++;


    }

    public void remove(int index) {  // 삭제
        for (int i = index; i < list.length-1; i++) {
            list[i] = list[i + 1];
        }
       String[] str = Arrays.copyOfRange(list, 0, list.length - 1);

        list = str;
        this.index--;

    }

    public int indexOf(String string) {
        int result = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(string)) {
                result = i;
            }
        }
        return result;
    }

    public void set(int index, String value) { //수정

        list[index] = value;

    }
    public void clear(){
        list =  new String[1];
        index = 0;
    }

    public String get(int index) {

        if (index < 0 || index >= this.index) {
            throw new IndexOutOfBoundsException();
        }
        return list[index];
    }
    public int size(){
        return index;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
