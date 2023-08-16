package com.test.obj;

import java.util.Arrays;

public class PencilCase {

    private String color;
    private Pencil[] pencil = new Pencil[5]; //***
    private int index = 0;

    //연필을 필통안에 넣기(***)
    public void add(Pencil pencil) {
        if (index < this.pencil.length) {
            this.pencil[index] = pencil;
            index++;
        } else {
            System.out.println("필통에 연필이 꽉 찼습니다.");
        }
    }

    // 필통에서 연필 꺼내기
    public Pencil get(int index) {
        Pencil p = pencil[index];

        //Left Shift
        for (int i = index; i < this.pencil.length - 1; i++) {
            pencil[i] = pencil[i + 1];
        }
        pencil[this.pencil.length - 1] = null;
        index--;
        return p;
    }
    public String info(){
        return Arrays.toString(pencil);
    }


    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }


}
