package com.test.java;

public class Ex09_OutPut {
    public static void main(String[] args) {

    /*
        콘솔 입출력 , Console Input OutPut

        CLI > Command Line Interface > 텍스트 기반 명령 입출력 환경
        GUI > Graphic User Interface > 화면 기반 입출력 환경


        -기본 입력 장치 : 키보드
        -기본 출력 장치 : 모니터

        콘솔출력
        -클래스.필드.메서드(인자)

        1.System.out.println();
         - println 메서드

        2.System.out.print();
         - print 메서드

        3.System.out.printf();
         - printf 메서드
         - print fotmat
    */

        // 성적표 출력하기
        String name = "홍길동";

        int kor = 100;
        int eng = 90;
        int math = 80;

        String name2 = "아무개";
        int kor2 = 85;
        int eng2 = 54;
        int math2 = 76;

        System.out.println("===================================");
        System.out.println("               성적표");
        System.out.println("===================================");
        System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t");
        System.out.println("\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t");
        System.out.println("\t" + name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2 + "\t");

        // 요구사항] "안녕하세요.홍길동님" 문장을 출력하세요
        System.out.printf("\"안녕하세요 %s님\"\n", name);

        //요구사항] "안녕하세요.홍길동님.안녕히가세요.홍길동님"
        System.out.printf("\"안녕하세요.%s님.안녕히가세요.%s님\"\n", name, name);
        /*
            형식문자
        1. %s -> String
        2. %d -> Decimal(정수) > byte , short , int , long
        3. %f -> Float(실수) > float , double
        4. %c -> char
        5. %b -> Boolean
        */
        System.out.printf("저는 %s 입니다. 나이는%d살입니다.키는 %fcm입니다. 혈핵형은%c입니다. %b \n", "홍길동", 20, 134.3, 'A',false);

    /*
        형식문자 > 확장기능
        1. %숫자s, %숫자d, %숫자f , %숫자c , %숫자 b
        - 출력할 너비를 지정한다.
        - 탭문자와 유사한 역할
        - + : 우측정렬
        - - : 좌측정렬
    */
        System.out.printf("[%-10d]\n", 123); // 10칸 확보하고 출력
        System.out.printf("[%10d]\n", 123);
        /*
        2. %.숫자f
        - 소수점 이하 자릿수 지정
        - %f > 소수이하 6자리 강제 출력
              */
        double num2 = 3.15;
        System.out.printf("%f\n", num2);
        System.out.printf("%.2f\n", num2);
        System.out.printf("%.1f\n", num2); // 반올림
        System.out.printf("%.0f\n", num2);
        /*

        3. %,d , %,f
        - 자릿수 표기(3자리)
                */
        int price = 1234567;
        System.out.printf("금액: %d원\n", price);
        System.out.printf("금액: %,d원\n", price); // %d 사이에 , 찍어주면 3자리수마다 ,찍어줌 보기쉽게

        // 천단위 + 소수이하 2자리 + 전체너비(20자리)
        double num3 = 1234567.89012345;
        System.out.printf("[%f]\n", num3);
        System.out.printf("[%,20.2f]\n", num3); // 총 20자리 , 소수점이하 2자리 까지

        System.out.println("================================================");
        System.out.println("                    메뉴판");
        System.out.println("================================================");
        System.out.printf("콜라:\t\t %,6d원\n", 2500);
        System.out.printf("사이다:\t\t %,6d원\n", 3500);
        System.out.printf("카페라떼:\t %,6d원\n", 500);
        System.out.printf("아메리카노:\t %,6d원\n", 15000);

    }
}
