package com.test.io;

import java.io.*;
import java.util.Scanner;

public class Ex65_File {
    public static final String FILE = "C:\\class\\code\\java\\file\\list.txt";
    public static void main(String[] args) {


        /*
            파일 입출력
            -응용프로그램 <-(데이터) -> 저장장치(*.txt)

            저장장치
            -데이터 1,0으로 저장
            -데이터 자료형 존재x > 모두다 문자

            인코딩, Encoding
            - 문자 코드(자바 데이터)를 부호화(0,1) 시키는 작업
            - 자바 프로그램("홍길동") > 텍스트파일(100100100110110)

            디코딩, Decoding
            -부호화 데이터를 문자 코드를 변환하는 작업
            텍스트파일(100100100110110) > 자바 프로그램("홍길동")

            인코딩/디코딩 규칙
            1. ISO - 8859 -1
            2. EUC - KR
            3/ ANSI
            4. MS949
            5. UTF - 8
            8. UTF = 16
            9. ASCII

            ANSI(ISO-8859-1, EUC-KR, MS949)
           1. 영어(숫자, 특수문자, 서유럽 등) : 1Byte
           2. 한글 : 2Byte

            UTF - 8(Unicode) ****** 무조건 이걸 사용 > 국제 표준
            1. 영어 : 1byte
            2. 한글 : 3byte

            UTF - 16
            1. 영어 : 2byte
            2. 한글 : 2byte

            [ANSI]영어.txt
            [ANSI]한글.txt

        */
     //   m1();

      //  m2();
     //   m3();
   //     m4();
     //   m5();
    //    m6();
  //      m7();
        m8();
    }

    private static void m8() { // 코드 출력해보기
        try {

            BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\Hello.java"));

            String line = null;
            int n = 1;
            while ((line = reader.readLine()) != null) {
                System.out.printf("%3d: %s\n", n, line);
                n++;
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    private static void m7() {//메모장 쓰기

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("저장할 파일명 : ");
            String filename = scanner.nextLine();

            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\" + filename + ".txt"));

            while (true) {

                System.out.print("입력 : ");
                String line = scanner.nextLine();

                if (line.equals("exit")) {
                    break;
                }
                writer.write(line); // 한줄 입력(scan) > 한줄 쓰기(writer)
                writer.write("\r\n");

            }

            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void m6() { //BufferedReader
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\memo.txt")); // 텍스트 파일 읽는 스트림


            /*String line = reader.readLine();
            System.out.println(line);
            */
            String line = null;

            while ((line = reader.readLine()) != null) {  // 더이상 읽을게 없으면 null을 반환해서 null이아닐경우까지만
                System.out.println(line);
            }
            reader.close();

        } catch (Exception e) {

        }
    }

    private static void m5() { //BufferedWriter

        //쓰기
        // BufferedWriter


        //읽기
        // BufferedWReader

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\memo.txt"));

            writer.write("하나");
            writer.write('A');
            writer.write("\r\n");
            writer.write("둘");
            writer.newLine();
            writer.write("셋");

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void m4() {
        try {
            FileReader reader = new FileReader("C:\\class\\code\\java\\file\\list.txt");
/*
            int code = reader.read();

            System.out.println((char) code);*/

            int code = -1;

            while ((code = reader.read()) != -1) {
                System.out.println((char) code);

            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void m3() {
        //쓰기
        // - FileOutputStream > FileWiter

        // 읽기
        // FileInputStream > FileReader

        try {
            FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\list.txt");

            //writer.write(65);
           // writer.write("ABC");
            writer.write("홍길동");
            writer.close();
            System.out.println("종료");

             writer = new FileWriter("C:\\class\\code\\java\\file\\list.txt");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void m2() {
        try {
            //파일 읽기
            // FileOutputStream
            // FileInputStream


            File file = new File(Ex65_File.FILE);

            //읽기 스트림 객체
            FileInputStream stream = new FileInputStream(Ex65_File.FILE);

            int code = -1;

            while ((code = stream.read()) != -1) {  // 매우 중요한 while문

                System.out.print((char) code);


            }
                System.out.println();


            stream.close();
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
    }

    private static void m1() {
        //파일 쓰기
        //- 도구
        //쓰기 스트림 객체

        //쓰기 스트림 객체
        //1. 생성 모드 , Create mode > 덮어쓰기 > 더많이사용
        // - 기본값
        // a. 파일이 존재하지 않으면 자동으로 생성한다.
        // b. 파일이 존재하면 항상 덮어쓰기를 한다

        //2. 추가 모드 , Append mode > 기존 내용 > 이어쓰기
        // a. 파일이 존재하지 않으면 자동으로 생성한다.
        // b. 파일이 존재하면 항상 이어쓰기를 한다.


        try {
            File file = new File("C:\\class\\code\\java\\file\\list.txt");

            //스트림 > 스트림 열기
            // - 바이트 단위 쓰기(1byte)
            FileOutputStream stream = new FileOutputStream(file, true); // true 하면 이어쓰기함

           /* stream.write('A');
            stream.write('B');
            stream.write('C');*/

            String txt = "Hello~ world!!";   //문자열넣기
            for (int i = 0; i < txt.length(); i++) {
                stream.write(txt.charAt(i));
            }



            //스트림 닫기
            stream.close();
            System.out.println("종료");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
