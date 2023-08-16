package com.test.java;

public class Ex08_Escape {
    public static void main(String[] args) {
/*
        특수문자 > Escape Sequence

            컴파일러가 번역을 할때 소스상에 있는 문자를 그대로 출력하지 않고
                미리 약속된 표현으로 바꿔서 출력하는 요소
             1.\n
             - new line , line feed 개행 문자 (엔터)
*/
        char c1 = '\n';
        String s1 = "\n";
    // 요구 사항] "안녕하세요.홍길동입니다." 추력해주세요.
        String msg = "안녕하세요.\n홍길동입니다.";

        System.out.println(msg);
/*
              운영체제 엔터
             1.윈도우 :\r\n
             2.맥os :\r
             3.리눅스:\n
*/
/*
              \t
             -tab,탭문자
             서식 작업(열맞추기)
 */
        System.out.println("하나\t둘\t셋");

        /*

        4. \b
        -backspace
        -이클립스 콘솔에서는 동작 안함
*/
        System.out.println("홍길동\b입니다");
    /*    5. \",\',\\
         -(",',\) 이미 역할을 가지고 있는 문자를 > 출력하기위해 의미없게 만드는 이스케이프 문자
        요구사항] 홍길동: "안녕하세요"
    */
        System.out.println("홍길동:\"안녕하세요\"");
        System.out.println("C:\\Users\\user\\.jdks\\openjdk-20.0.1\\bin\\java.exe");

    }
}
