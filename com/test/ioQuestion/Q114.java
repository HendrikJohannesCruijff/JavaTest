package com.test.ioQuestion;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Q114 {
    public static void main(String[] args) {

        String path = "D:\\";

        File dir = new File(path);
        HashMap<String, Integer> count = new HashMap<>();

        File[] list = dir.listFiles();
        for (File file : list) {
            String ext = file.getName().substring(file.getName().lastIndexOf(".") + 1);
            if (count.get(ext) == null) {
                count.put(ext, 0);
            } else {
                count.put(ext, count.get(ext) + 1);
            }
        }
        System.out.println(count);
        Set<String> keys = count.keySet();

        for (String key : keys) {
            System.out.printf("*.%s : %d개\n", key, count.get(key));
        }

    }

}
