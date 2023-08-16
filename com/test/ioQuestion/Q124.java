package com.test.ioQuestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Q124 {
    public static void main(String[] args) {

        try {
            BufferedReader brOrder = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\파일_입출력_문제\\검색_주문.dat"));
            BufferedReader brMember = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\파일_입출력_문제\\검색_회원.dat"));

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String member = null;
            String order = null;

            System.out.println("이름 : ");
            String name = br.readLine();

            while ((member = br.readLine()) != null) {

                String[] arr = order.split(",");

                if (arr[1].equals(name)) {

                }
            }

            while ((order = br.readLine()) != null) {


            }











        } catch (Exception e) {
            e.printStackTrace();

        }


    }
}

