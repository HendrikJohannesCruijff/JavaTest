package com.test.ioQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q121 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\파일_입출력_문제\\숫자.dat"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\파일_입출력_문제\\숫자_변환.dat"));

            String line = null;
            while ((line = br.readLine()) != null) {
                line = line.replace("0", "영")
                        .replace("1", "일")
                        .replace("2", "이")
                        .replace("3", "삼")
                        .replace("4", "사")
                        .replace("5", "오")
                        .replace("6", "육")
                        .replace("7", "칠")
                        .replace("8", "팔")
                        .replace("9", "구");
                bw.write(line);

            }
            br.close();
            bw.close();
            System.out.println("변환 후 다른 이름으로 저장하였습니다.");

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
