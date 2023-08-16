package com.test.question;

import java.util.Arrays;

public class Q084 {
    public static void main(String[] args) {
        String content  = "안녕~ 길동아~ 잘가~ 길동아~ 잘가~ 길동아~ 잘가~ 길동아~";
        String word  ="길동";
        String[] dd = content.split("~"); //[안녕,  길동아,  잘가,  길동아,  잘가,  길동아,  잘가,  길동아]
        System.out.println(Arrays.toString(dd));

        int count = 0;
        for (int i = 0; i < dd.length; i++) {
            if (dd[i].indexOf(word) > -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
