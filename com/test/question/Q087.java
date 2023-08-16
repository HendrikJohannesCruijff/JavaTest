package com.test.question;

public class Q087 {
    public static void main(String[] args) {
        String str = "StudentName";
        String a = " ";
        String b = " ";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i != 0 && c >= 'A' && c <= 'Z') {
                System.out.print(" ");
            }
        System.out.print(c);
        }
    }
}
