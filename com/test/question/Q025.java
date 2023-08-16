package com.test.question;

import java.util.Scanner;

public class Q025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력 : ");
        int first = sc.nextInt();
        System.out.println("두번째 숫자 입력 : ");
        int second = sc.nextInt();

        if (first > second) {
            System.out.printf("큰수는 %d이고 작은수는 %d 입니다 두 숫자는 %d 차이가 난다더라", first, second, (first - second));

        } else if (second > first) {
            System.out.printf("큰수는 %d이고 작은수는 %d 입니다 두 숫자는 %d 차이가 난다더라", second, first, (second - first));
        } else {
            System.out.println("같은 수 입니다.");
        }

    }
}
