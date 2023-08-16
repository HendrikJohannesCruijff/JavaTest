package com.text.question;

import java.util.Arrays;

public class Box {
    private Macaron[] list = new Macaron[10];

    public void cook() {
        String[] arr = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};

        for (int i = 0; i < list.length; i++) {
            Macaron m = new Macaron();

            m.setSize((int) (Math.random() * 11) + 5);
            m.setColor(arr[(int) (Math.random() * arr.length)]);
            m.setThickness((int) (Math.random() * 20) + 1);

            list[i] = m;
        }
        System.out.printf("마카롱을 %d개 만들었습니다.\n", list.length);
        System.out.println();
    }
    public void check() {
        int pass = 0;
        int failed = 0;
        for (int i = 0; i < list.length; i++) {
            Macaron m = list[i];
            if (check(m)) {
                pass++;
            } else {
                failed++;
            }
        }
        System.out.println("[박스 체크 결과]");
        System.out.printf("QC 합격개수 : %d개 \nQC 불합격 개수 : %d개\n", pass, failed);


    }

    private boolean check(Macaron macaron) { // 유효성 검사
        if (!(macaron.getSize() > 7 && macaron.getSize() < 15)) {
            return false;
        }
        if (macaron.getColor().equals("black")) {
            return false;
        }
        if (macaron.getThickness() < 3 || macaron.getThickness() > 18) {
            return false;
        }
        return true;
    }


    public void list() {
        System.out.println("[마카롱 목록]");
        for (int i = 0; i < list.length; i++) {
            Macaron m = list[i];
            System.out.printf("%d번 마카롱 : %dcm(%s,%dmm) : %s\n"
                    , i+1
                    , m.getSize()
                    , m.getColor()
                    , m.getThickness()
                    , check(m) ? "합격" : "불합격");

        }
    }
}

class Macaron {
    private int size;
    private String color;
    private int thickness;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
}

