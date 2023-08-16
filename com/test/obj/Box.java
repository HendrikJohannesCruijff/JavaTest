package com.test.obj;

import com.sun.security.jgss.GSSUtil;

public class Box {

    // public > 해당 클래스 외부에 이 맴버를 공개하겠다.
    public String color;

    // private > 해당 클래스 외부에 이 맴버를 비공개하겠다.
    // - 위험해서
    // - 공개할 필요가 없어서
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void aaa() {
        System.out.println("aaa");
    }

    private void bbb() {
        System.out.println("bbb");
    }
}
