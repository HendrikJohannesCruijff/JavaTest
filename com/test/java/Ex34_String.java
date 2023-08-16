package com.test.java;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Ex34_String {
    public static void main(String[] args) {

        // 문자열 , String
        // -JDK 제공하는 문자열 조작 기능
        //String[] split  / String replace / String.contains / 문자열 추출 substirng
        // String toUpperCase()  /indexOf . lastIndexOf  / String trim()
        // String toLowerCase()


    //    m1();

    //    m2();
       // m3();
       // m4();
       //m5();
        //m6();
   //    m7();
       // m8();
      //  m9();
      //  m10();
       // m11();
       // m12();
        m13();
    }

    private static void m13() { //String[] split
        //문자열 분리
        //String[] split(String delimiter)
        // 구분자를 기준으로 쪼개는 메서드

        String name = "홍길동,아무개,유재석,강호동,박명수,";
        String[] temp = name.split(",");
        System.out.println(Arrays.toString(temp));

    }

    private static void m12() {  // String replace
        // 문자열 치환(바꾸기)
        // String replace(String old, String new)
        // 문자열의 일부(Old)를 다른 문자열(new)로 바꾸는 메서드

        String txt = "안녕하세요. 홍길동입니다.";

/*        int index = txt.indexOf("홍길동");
        String temp1 = txt.substring(0, index);
        String temp2 = txt.substring(index + 3);

        System.out.println(temp1 + "아무개" + temp2);*/

        System.out.println(txt.replace("홍길동", "아무개"));  // 문자바꾸기

        System.out.println("================================");
        txt = "   하나    둘   셋    ";
        System.out.println(txt.trim());
        System.out.println(txt.replace(" ", ""));   // 빈공간 삭제하기

    }

    private static void m11() {  // String.cntains
        // 문자열 검색
        // indexOf() , lastIndexOf()
        // startsWith(), endsWith()

        //boolean contains(String)

        String txt = "안녕하세요. 홍길동입니다.";

        System.out.println(txt.contains("홍길동"));
        System.out.println(txt.contains("아무개"));
    }

    private static void m10() { // 문자열 추출 substirng
      // 문자열 추출
        // String substring(int beginIndex,int endIndex)
        // String substring(int beinIndex)
        // beginIndex : 포함(inclusive)
        // endIdex : 미포함(exclusive)

        // **** 자바에서는 범위를 나타낼때 > 시작(포함) ~ 끝(미포함)

        String txt = "가나다라마바사아자차카타하";
        System.out.println(txt.substring(3, 7));
        System.out.println(txt.charAt(5));
        System.out.println(txt.substring(5,6)); //substring 에서 한글자 추출하기
        System.out.println(txt.substring(3)); // 시작 인덱스만 입력해주면 거기부터 끝까지 출력

        System.out.println("=============================================");
        // 주민 번호

        String jumin = "970728-1012345";

        // 성별?
        System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
        System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자");

        // 몇년생?
        System.out.println(""+jumin.charAt(0) + jumin.charAt(1));  // 캐릭터라 아스키코드 값으로나옴 , 앞에 빈문자열 넣어주면되긴함
        System.out.println(jumin.substring(0, 2)); // 이럴떈 이게더편함
        //몇월생?
        System.out.println(jumin.substring(2, 4));
        //몇일생?
        System.out.println(jumin.substring(4,6));
        System.out.println();
        System.out.println("===============================");
        String path = "C:\\Users\\user\\.jdks\\openjdk-20.0.2\\bin\\java.exe.com.test.java.Ex34_String";

        // 1.파일명 추출 > com.test.java.Ex34_String
        int index = path.lastIndexOf("\\");

        String fileName = path.substring(index + 1);
        System.out.println(fileName);
        // 2. 확장자 없는 파일명 추출 >  Ex34_String
        index = fileName.lastIndexOf(".");
        String filenameWithoutExtension = fileName.substring(0, index);
        System.out.println(filenameWithoutExtension);
        // 3. 확장자 추출 > ".java"
        index = fileName.indexOf(".");
        String file = fileName.substring(0, index);
        System.out.println(file);
    }

    private static void m9() { // 패턴검색
        // 패턴 검색
        // boolean startsWith(String) // 파라미터 값을 시작하냐
        // boolean endWith(String)  // 파라미터 값으로 끝나냐
        String txt = "자바 프로그래밍";

        System.out.println(txt.startsWith("자바")); // "자바" 라는 글자부터 시작하냐 물어봄
        System.out.println(txt.startsWith("프로그래밍"));

        System.out.println(txt.endsWith("자바"));
        System.out.println(txt.endsWith("프로그래밍")); // "프로그래밍" 이라는 글자로 끝나냐
        System.out.println("=============================================");
        // 밑에는 다똑같은 방법
        String name = "홍길동";
        System.out.println(name.startsWith("홍"));
        System.out.println(name.charAt(0) == '홍');
        System.out.println(name.indexOf("홍길동") == 0);
        System.out.println("============================================");

        System.out.println("name.endsWith() = " + name.endsWith("동"));
        System.out.println(name.charAt(name.length() - 1) == '동');
        System.out.println(name.indexOf("동") == name.length() - 1);

        System.out.println("===================================================");
        String path = "C:\\Users\\user\\.jdks\\openjdk-20.0.2\\bin\\java.exe";
        // 해당 파일이 '자바 소스 파일' 입니까? > 확장자검사
        if (path.endsWith("java.exe")) {
            System.out.println("자바소스파일");
        } else {
            System.out.println("다른 파일");
        }
        
        
    }

    private static void m8() {
        //대소문자 변경
        // String toUpperCase()
        // String toLowerCase()

        String content = "오늘 수업은 Java 입니다.";
        String word = "java";

        System.out.println(content);
        System.out.println(content.toUpperCase());
        System.out.println(content.toLowerCase());

        // 대소문자 구분
        // 정확도는 높고 , 검색율은 낮음
        if (content.indexOf(word) > -1) {
            System.out.println("결과 O");
        } else {
            System.out.println("결과 x");
        }
        System.out.println("============================");
        // 검색할때 대소문자 구분안하고 찾음
        // 정확도는좀 떨어지지만 검색율은 높아짐
        if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
            System.out.println("결과 O");
        } else {
            System.out.println("결과 x");
        }



    }

    private static void m7() {

        String jumin = "970728-2012345";

        if (jumin.charAt(6) == '-') {
            System.out.println("0");
        } else {
            System.out.println("x");
        }
        if (jumin.indexOf("-") == 6) {
            System.out.println("0");
        } else {
            System.out.println("x");
        }

        // 게시판 글쓰기 > 관리자 > 금지어!!   / 문자열에서 문자 찾기
        String word = "바보";
        String content = "안녕하세요. 반갑습니다 ~ 바 자바를 공부하고 있어요";

        if (content.indexOf(word) > -1) {  //인덱스가 0이상이면 포함되어있다는뜻
            System.out.println("금지어 발견!!");
        } else {
            System.out.println("글쓰기 진행");
        }
        System.out.println("======================================");
        String[] str = {"바보", "멍청이", "메롱", "ㅂㅏㅂㅗ"};  // 여러개 금지어 설정
        for (int i = 0; i < str.length; i++) {
            if (content.indexOf(str[i]) > -1) { //금지어 배열을 돌아가면서 검사
                System.out.println("금지어 발견!!");
                break;
            }

        }

    }


    private static void m6() {
        // 문자열 조작
        // 1. int length()
        // 2. char charAt(int)
        // 3. String trim()

        // 문자열 검색
        // int indexOf(char)
        // int indexOf(String)
        // int indexOf(char,int)
        // int index(String,int)

        // int lastIndexOf(char)    뒤에서부터 탐색
        // int lastIndexOf(String)
        // int lastIndexOf(char)
        // int lastIndexOf(char)

        String txt = "안녕하세요. 홍길동입니다.";

        int index = -1;

        index = txt.indexOf('하');

        System.out.println(index);

        index = txt.indexOf('홍');
        System.out.println(index);

        index = txt.indexOf("김");
        System.out.println(index);

        index = txt.indexOf("홍길동");  // 여러개를 찾더라도 첫글자의 인덱스만 반환함
        System.out.println(index);

        txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
     /*   index = txt.indexOf("홍길동",8); // 시작할 인덱스 지정가능
        System.out.println(index);

        index = txt.indexOf("홍길동");
        System.out.println(index);
*/
        index = -1;
     //   for (int i = 0; i < 3; i++) {

        while (true) {  // 문자열에서 똑같은  문자의 인덱스를 찾는 방법
            index = txt.indexOf("홍길동", index);
            if (index == -1) {  // 홍길동을 못찾았다면 break;
                break;
            }
            System.out.println(index);
            index += 3;
        }


        txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다.";

        System.out.println(txt.indexOf("홍길동"));   // 7
        System.out.println(txt.lastIndexOf("홍길동"));   // 22   lastIndexOf 뒤에서 부터 탐색

    }

    private static void m5() {// String trim()
        // 공백 제거
        // 문자열내의 앞뒤 공백 (whitespace > 스페이스 , 탭 , 개행 )문자를 제거
        String txt = "  하나   둘  셋  ";
        System.out.println(txt.trim());
    }

    private static void m4() {  // 주민등록증 - < 같이 추출하기
        // 주민등록번호 : 970727-1000001
        String pw = "970727-2000001";

        System.out.println(pw.charAt(6));


        if (pw.charAt(6) == '-') {
            System.out.println("올바른 주민번호");
            if (pw.charAt(7) == '1' || pw.charAt(7) == '3') {
                System.out.println("남자");
            } else {
                System.out.println("여자");
            }
        } else {
            System.out.println("올바르지 않는 주민번호");
        }

    }

    private static void m3() { //요구사항] 회원 가입 > 아이디 입력 > 영어 소문자만 입력
        Scanner sc = new Scanner(System.in);
        System.out.println(" 아이디 : ");
        String id = sc.nextLine();
        //아이디 : hong
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);   // charAt() 으로 하나씩비교
            if (c < 'a' || c > 'z') {  // 소문자가 아니라면
                System.out.println("잘못된 문자가 발견되었더랬죠 ");
                break;
            }
        }
        System.out.println("종료");
    }

    private static void m2() {    //문자열 추출
        // - char charAt(int index)
        String txt = "안녕하세요 홍길동 입니다.";

        char c = txt.charAt(txt.length()-1);
        System.out.println(c);
    }

    private static void m1() {// 문자열(String) , 문자(char)
        // 문자열 == 문자의 집합
        // String == char[]
        // 문자열 조작 기능 == 배열 조작 기능 유사

        // 문자열 길이
        // int length()
        // 문자열의 글자수

        char[] cList = {'홍', '길', '동'};
        System.out.println(cList.length);

        String str = "홍길동";
        System.out.println(str.length());

        System.out.println("홍길동".length());

        System.out.println("A1가$ ".length()); // 한글 영어 특문 숫자 / 각각 한글자로 취급


        // 요구사항] 회원 가입 > 이름 입력 > 이름을 2자~5자이내로 작성.
        //  -유효성 검사
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        if (name.length() > 1 && name.length() < 6) {
            System.out.println(" 통과 ");
        } else {
            System.out.println("X 이름을 2~5자 이내로 작성 하시요.");

        }
    }

}
