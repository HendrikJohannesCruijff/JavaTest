package com.test.List_104;

import java.util.Arrays;

public class MySet {

    String[] list;
    int index;
    int sindex;
    public MySet(){
        list = new String[1];
        index = 0;
    }

    public void add(String string) {

        if (lengthCheck()) {
            doubleLength();
        }
        for (int i = 0; i < index; i++) {
            if (list[i].equals(string)) {
                return;
            }
        }

        list[index] = string;
        index++;
    }
    private boolean lengthCheck(){
        return index == list.length;
    }
    private void doubleLength(){
        String[] temp = new String[list.length + 1];
        for (int i = 0; i < index; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }

    public boolean hasNext(){
        return sindex < index;
    }

   public String next(){
       String temp = list[sindex];
       sindex++;

       return temp;
    }
    public void clear(){
        list = new String[1];
        index = 0;
        
    }




    public void remove(String string) {
        for (int i = 0; i < index; i++) {
            if (list[i].equals(string)) {
                list[i] = list[i + 1];
            }
        }
        list[index-1] = null;
        index--;
    }

    public int size(){
        return index;
    }

    @Override
    public String toString() {
        return "MySet{" +
                "list=" + Arrays.toString(list) +
                ", index=" + index +
                '}';
    }
}
