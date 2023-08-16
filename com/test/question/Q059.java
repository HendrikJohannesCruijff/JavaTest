package com.test.question;

public class Q059 {
    public static void main(String[] args) {

        //1 + 2 + 4 + 7 + 11 + 16 + 22 + 29 + 37 + 46 + 56 + 67 + 79 + 92 +  = 469
        int sum = 1, num = 2 , a=1;

        System.out.print(sum + " + ");
        System.out.print(num + " + ");
        while (true) {
            sum += num;
            a++;
            num += a;
            if (num > 100) {
                System.out.println("= " + sum);
                break;
            }
            System.out.print(num+" + ");

        }

    }


}
