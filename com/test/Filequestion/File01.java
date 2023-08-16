package com.test.Filequestion;

import java.io.File;
import java.util.Scanner;

public class File01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("파일 경로 : ");
        String path = sc.nextLine();

        File file = new File(path);
        System.out.printf("파일명 : %s\n", file.getName());
        System.out.printf("종류 : %s 파일\n", file.getName().substring(file.getName().lastIndexOf("-") + 1));
        System.out.printf("파일크기 : %s\n", getSize(file.length()));

    }

    private static String getSize(long length) {
        if (length < 1024) {
            return length + "B";
        } else if (length < 1024 * 1024) {
            return String.format("%.1f", length / 1024.0) + "KB";
        } else if (length < 1024 * 1024 * 1024) {
            return String.format("%.1f", length / 1024.0/ 1024.0) + "MB";
        } else if (length < 1024 * 1024 * 1024 * 1024) {
            return String.format("$.1f", length / 1024.0 / 1024.0 / 1024.0) + "GB";
        } else {
            return String.format("$.1f", length / 1024.0 / 1024.0 / 1024.0 / 1024.0) + "TB";
        }
    }
}
