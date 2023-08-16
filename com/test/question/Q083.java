package com.test.question;

import java.util.Scanner;

public class Q083 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] file = new String[10]; // 파일명
        int[] sum = new int[5]; // 확장자 누적 합계
        String[] extension = {"mp3", "jpg", "java", "hwp", "doc"}; // 확장자 리스트

        // 파일명 입력
        for (int i = 0; i < file.length; i++) {
            System.out.print("파일명: ");
            file[i] = scan.nextLine();

            // 파일 확장자 추출
            int index = file[i].lastIndexOf(".");
            String fileExtension = file[i].substring(index);

            // 확장자 누적 합계
            for (int j = 0; j < extension.length; j++) {
                if (fileExtension.replace(".", "").equals(extension[j])) {
                    sum[j]++;
                }
            }
        }

        // 확장자 누적 합계 출력
        for (int i = 0; i < extension.length; i++) {
            System.out.printf("%s : %d개\n", extension[i], sum[i]);
        }

        scan.close();

    }
}