package com.test.ioQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q120 {
    public static void main(String[] args) {


        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\파일_입출력_문제\\이름수정.dat"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\파일_입출력_문제\\이름수정_변환.dat"));
            String line = null;
            while ((line = br.readLine()) != null) {
                line = line.replace("유재석", "메뚜기");
                bw.write(line);
            }
            br.close();
            bw.close();
            System.out.println("complete");

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
