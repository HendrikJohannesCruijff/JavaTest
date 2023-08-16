package com.test.ioQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Q122 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\파일_입출력_문제\\성적.dat"));

            String line = null;
            ArrayList<String> passList = new ArrayList<>();
            ArrayList<String> failList = new ArrayList<>();



            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");

                int kor = Integer.valueOf(str[1]);
                int eng = Integer.valueOf(str[2]);
                int math = Integer.valueOf(str[3]);

                double avg = (kor + eng + math) / 3.0;

                if ((kor > 39 || eng > 39 || math > 39) && avg > 60) {
                    passList.add(str[0]);
                } else {
                    failList.add(str[0]);
                }


            }
            System.out.println("[합격자]");
            for (String name : passList) {
                System.out.println(name);
            }
            System.out.println("[불합격자]");
            for (String name : failList) {
                System.out.println(name);
            }


        } catch (Exception e) {
            e.printStackTrace();

        }


    }
}
