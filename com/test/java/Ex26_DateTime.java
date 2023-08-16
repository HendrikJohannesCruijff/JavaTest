package com.test.java;
// 캘린더 클래스
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.function.DoubleFunction;

// Date , Calendar
public class Ex26_DateTime {
    public static void main(String[] args) {

/*
        자료형
        1. 값형
            -8가지
        2. 참조형
            -클래스
                -String
                -날짜시간

          자바 날짜/시간 자료형
          1. Date 클래스
          2. Calendar 클래스
          3. 추가 클래스 > JDK 1.8(2014)


          - 시각
          - 시간

          2023년 7월 20일 오후 4시 9분 15초 > 시각? 시간?
          8시간 수업 > 시간

          시각 > 시간점의 흐름 > 포인트 , 점

          시각 ,시간 > 연산

          시각 + 시각 = x
          시각 - 시각 = O (시간)

          시간 + 시간 = O(시간)
          시간 - 시간 = O(시간)

          시각 + 시간 = O(시각)
          시각 - 시간 = O(시각)



             */
      //  m1();
       // m2();
        // 요구사항 " 오늘은 2023년 7월 20일 입니다.

        // 요구사항] "지금은 17시 05분 50초입니다." - 24
        // 지금은 오후 5시 05분 50초 입니다. - 12

        Calendar c2 = Calendar.getInstance();
        System.out.printf("지금은 %d시 %02d분 %02d초 입니다.\n"  // %02d < 2자리수 표현 , 한자리수면 앞에 0으로채움
                , c2.get(Calendar.HOUR_OF_DAY)
                , c2.get(Calendar.MINUTE)
                , c2.get(Calendar.SECOND));

        System.out.printf("지금은 %s %d시 %02d분 %02d초 입니다.\n"  //
                , c2.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
                , c2.get(Calendar.HOUR_OF_DAY)
                , c2.get(Calendar.MINUTE)
                , c2.get(Calendar.SECOND));

        // prinf() > 형식 문자 > 날짜 시간
        System.out.printf("%tF\n", c2); // 2023-07-20

        System.out.printf("%tT\n", c2); // 17:17:24

        System.out.printf("%tA\n", c2); // 목요일

        System.out.println("===================================");
    //    M3();
        //M4();
     //   M5();

   //     m6();
        getM7();
    }

    private static void getM7() {

        Calendar now = Calendar.getInstance();
        System.out.println(now.getTimeInMillis());

        // 전용 메서드 ( 현재 시각의 tick을 구하는 전용 메서드)
        System.out.println(System.currentTimeMillis());

    }

    private static void m6() {  // 시 , 분 구하기

        //연산
        // 시간 + 시간 = 시간
        // 시간 - 시간 = 시간

        // 점심 : 2시간

        int hour = 2;
        int minute = 30;

        minute += 35;

        hour = hour + (minute / 60);

        minute = minute % 60;
        System.out.printf("%d시 %d분",hour,minute);

    }

    private static void M5() {
        // 연산
        // 시각 - 시각 = 시간

        //현재
        Calendar now = Calendar.getInstance();

        //종강일
        Calendar end = Calendar.getInstance();
        end.set(2023, 11, 27);

        now.getTimeInMillis();

        long nowTick = now.getTimeInMillis();
        System.out.println(nowTick); // 1689898991791  < 1970년 1월 1일 0시부터 현재시간까지 흐른시간

        long endTick = end.getTimeInMillis();  // 1970년 1월 1일 0시부터 종강일까지 흐른시간
        System.out.println(endTick); //1703636711666


        Calendar christmas = Calendar.getInstance();
        christmas.set(2023, 11, 25);

        long christmasTick = christmas.getTimeInMillis();

        System.out.printf("올해 크리스마스는 %d일 남았습니다",
                (christmasTick - nowTick) / 1000 / 60 / 60 / 24);

        Calendar birthday = Calendar.getInstance();

        birthday.set(1997, 9, 5);
        long birthdayTick = birthday.getTimeInMillis();

        System.out.printf("살아온 년 :%d\n"
                , (nowTick - birthdayTick) / 1000 / 60 / 60 / 24 / 365);
        System.out.printf("살아온 월 :%d\n"
                , (nowTick - birthdayTick) / 1000 / 60 / 60 / 24 / 30);
        System.out.printf("살아온 일 :%d\n"
                , (nowTick - birthdayTick) / 1000 / 60 / 60 / 24 );
        System.out.printf("살아온 시 :%d\n"
                , (nowTick - birthdayTick) / 1000 / 60 / 60 );

    }


    private static void M4() {
        //연산
        // 시간 + 시간
        // 시각 - 시간

        // 오늘 만난 커플 > 100일
        // 오늘(시각) + 100일(시간) = 기념일(시각)
        Calendar now = Calendar.getInstance();

        System.out.printf("1일차 : %tF\n", now);
        now.add(Calendar.DATE, 100);
        System.out.printf("1일차 : %tF\n", now);

        //돌잔치
        Calendar birthday = Calendar.getInstance();
        birthday.set(1997, 6, 20);
        birthday.add(Calendar.YEAR, 1);
        System.out.printf("돌잔치 : %tF\n", birthday);

        now = Calendar.getInstance(); // 현재시각

        now.add(Calendar.DATE, -12); // 시간빼기
        System.out.printf("12일 : %tF\n", now);

        // 지금 3시간 25분뒤 약 복욕
        now = Calendar.getInstance();
        now.add(Calendar.HOUR, 3);
        now.add(Calendar.MINUTE, 25);

        System.out.printf("약 복용 시간 : %tT\n", now);
    }

    private static void M3() {
        // 특정 시각을 생성하기 > 원하는 시각 생성 > 올해 크리스마스

        Calendar christmas = Calendar.getInstance();
        System.out.printf("%tF %tT\n", christmas , christmas);

        // 수정
        // - void set(오버로딩)

        christmas.set(Calendar.MONTH, 11);
        christmas.set(Calendar.DATE, 25);
        christmas.set(Calendar.HOUR_OF_DAY, 19);
        christmas.set(Calendar.MINUTE, 0);

        System.out.printf("%tF %tT\n", christmas , christmas);

        Calendar birthday = Calendar.getInstance();

        birthday.set(1997, 9, 04, 10, 30, 24);
        System.out.printf("%tF %tT\n", birthday, birthday);

    }


    private static void m2() {
    // 두번쨰 예제
        // Calendar 클래스

        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.get(Calendar.YEAR));          // 년도
        System.out.println(c1.get(Calendar.MONTH));         // 월
        System.out.println(c1.get(Calendar.DATE));          // 일
        System.out.println(c1.get(Calendar.HOUR));          // 시
        System.out.println(c1.get(Calendar.HOUR_OF_DAY));   // 시
        System.out.println(c1.get(Calendar.MINUTE));        // 분
        System.out.println(c1.get(Calendar.SECOND));        // 초
        System.out.println(c1.get(Calendar.MILLISECOND));   // 밀리초
        System.out.println(c1.get(Calendar.AM_PM));         // 오전 , 오후
        System.out.println(c1.get(Calendar.DAY_OF_YEAR));   // 일년의 일
        System.out.println(c1.get(Calendar.DAY_OF_MONTH));  // 일년의 달
        System.out.println(c1.get(Calendar.DAY_OF_WEEK));   // 월 ~일
        System.out.println(c1.get(Calendar.WEEK_OF_YEAR));  //  이번년도 몇주차
        System.out.println(c1.get(Calendar.WEEK_OF_MONTH)); // 이번달의 몇주차



        // 어떤 항목을 추출 > 필요한 숫자 > 미리 상수로 제공 > Calendar 상수



    }

    private static void m1() {

        // 첫번째 예제

        //Date 클래스

        Date date = new Date(); // 자신 pc의 시각을 꺼내온다
        System.out.println(date);

    }
}
