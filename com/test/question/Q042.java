package com.test.question;

public class Q042 {
    public static void main(String[] args) {

        int year =2023;
        int month = 7;
        int date = 25;

        int sum =0;
        String day = "";

        for (int i = 1; i < year; i++) {
            sum += 365;
            if (isLeafYear(i)) {
                sum++;
            }
        }
// 2023년 1월1일부터 ~ 6월 30일 까지
        for (int i = 1; i < month; i++) {
            sum += getMaxDate(year,i);
        }

        sum += date;
        System.out.printf("2023년 7월 25일은 %d일쨰 되는 날이고 %s화요일 입니다.\n",sum,day);

    }

    private static String getDay(int sum) {  //요일
        if (sum % 7 == 1) {
            return "월";
        } else if (sum % 7 == 2) {
            return "화";
        }else if (sum % 7 == 3) {
            return "수";
        }else if (sum % 7 == 4) {
            return "목";
        }else if (sum % 7 == 5) {
            return "금";
        }else if (sum % 7 == 6) {
            return "토";
        }
        return null;
    }
    private static int getMaxDate(int year, int month) {  //월

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return isLeafYear(year) ? 29 : 28;
        }
        return 0;
    }


    private static boolean isLeafYear(int year) {  // 윤년 구하기

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else { // 윤년이면 true리턴
                return true;
            }
        } else {  // 평년이면 false 반환
            return false;
        }
    }
}
