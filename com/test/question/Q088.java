package com.test.question;

public class Q088 {
    public static void main(String[] args) {
        String[] str = {"바보", "멍충이"};
        String txt = "너랑 안놀아  바보야!!";
        int count = 0;
        String replace = " ";
        for (int i = 0; i < str.length; i++) {
            if (txt.indexOf(str[i]) > -1) {
                count++;
                replace = txt.replace(str[i], aa(str[i]));

            }
        }
        System.out.println(replace);
        System.out.println("금지어를"+count+"회 마스킹 했습니다.");
    }
    static String aa(String str){
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            s += "*";
        }
        return s;
    }

}
