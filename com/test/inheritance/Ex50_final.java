package com.test.inheritance;

public class Ex50_final {
    public static void main(String[] args) {

        /*

        final 키워드
        - 한번 결장하면 못바꿈
        - 안전성이 높다

        1. 변수 적용 (지경 변수 , 맴버 변수)
        - 초기화 이후 값을 변경할 수 없다.
        - 상수

        2. 메서드 적용 / 거의 안씀
         - 상속
         - 오버라이드 금지!!라는뜻

        3. 클래스 적용 // 거의 안씀
          - 상속

        */

        //지역 변수
        // final int a = 10;
        final int E = 10;  // final은  변수명을 대문자로 써야한다.

        Test test = new Test();
        test.a = 20;
        //  test.b = 30;
        test(34);


        int gender;
        gender = 1;
        gender = 2;

        final int MALE = 1;
        final int FEMALE = 2;


        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);
    }
    public static void test(final int a) {
        System.out.println(a);
    }




}
class Test{
    public int a = 10;

    public final int b = 20; // 맴버 변수도 가능
}

class Gender{
    final static int MALE =1;
    final static int FEMALE = 2;
}

class FinalParent{

    // 부모 클래스 설계
    // test() > 나중에 상속받은 자식 클래스가 이 test() 메서드르 재정의하면 안될거같을떄 final 메서드를사용한다.
    public final void test(){
        System.out.println("부모 메서드");
    }
}
class FinalChild extends FinalParent{

}

// 부모 클래스 설계 > 상속 불가능
final class FinalMember{

}
/*

class FinalUser extends FinalMember {

}
*/



