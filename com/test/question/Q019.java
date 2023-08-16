package com.test.question;

import java.util.Calendar;
import java.util.Date;

public class Q019 {
    public static void main(String[] args) {

        nowTime();

    }

    static void nowTime() {
        Calendar calendar = Calendar.getInstance();

        System.out.printf("지금은 %d시 %02d분 %02d초 입니다"
                , calendar.get(Calendar.HOUR)
                , calendar.get(Calendar.MINUTE)
                , calendar.get(Calendar.SECOND));

    }
}
