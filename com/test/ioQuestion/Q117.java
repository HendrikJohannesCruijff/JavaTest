package com.test.ioQuestion;

import java.beans.FeatureDescriptor;
import java.io.File;
import java.io.IOException;

import static java.nio.file.Files.delete;

public class Q117 {
    public static void main(String[] args) {


        //내용있는 폴더 삭제
        File dir = new File("");

        //탐색
   //     delete(dir);

        System.out.println("종료");

    }

    private static void delete(File dir) throws IOException {
        File[] list = dir.listFiles();
        for (File f : list) {
            if (f.isFile()) {
                f.delete();
            }
        }
        for (File d : list) {
            if (d.isDirectory()) {
                delete(d);
            }
        }
    }
}
