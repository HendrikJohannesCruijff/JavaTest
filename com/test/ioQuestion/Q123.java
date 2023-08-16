package com.test.ioQuestion;

import java.io.*;

public class Q123 {
    public static void main(String[] args) {

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\파일_입출력_문제\\단일검색.dat"));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line = null;
            System.out.print("이름 : ");
            String name = br.readLine();
            int count = 1;
            while ((line = bufferedReader.readLine()) != null) {

                String[] arr = line.split(",");

                if (arr[1].equals(name)) {
                    System.out.println("[" + name + "]");
                    System.out.println("번호 : " + count);
                    System.out.println("주소 : " + arr[2]);
                    System.out.println("전화번호 : " + arr[3]);
                    return;
                }

                count++;

            }

            bufferedReader.close();




        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
