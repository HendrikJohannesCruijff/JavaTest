package com.test.question;

public class Q058 {
    public static void main(String[] args) {

        int sum = 0, num = 1,count = 1;
        while (true) {

            sum += num;
            num++;
            if (num % 10==1) {
                System.out.printf("%d ~ %d:  \t%d\n",count,num-1,sum);
                sum = num;
                num++;
                count += 10;
            } else if (num > 100) {
                break;
            }


        }
    }
}
