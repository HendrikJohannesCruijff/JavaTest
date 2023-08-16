package com.test.inheritance;

public class Ex47_Overriding {

    public static void main(String[] args) {

        /*

            메서드 오버로딩 , Method OverLoading
            = 메서드 이름 동일 x N개 생성 > 인자 리스트 변화

            메서드 오버라이딩 , Method Overriding
            = 클래스 상속 시에 발생
            = 메서드 재정의 > 상속받은 메서드를 수정(덮어쓰기) 하는 스킬


        */
        OverrideParent hong = new OverrideParent();
        hong.name = "홍길동";
        hong.hello();
        OverrideChild jhong = new OverrideChild();

        jhong.name = "홍철수";
        jhong.hello();


    }
}
// 상황] 동네 사람
class OverrideParent{
    public String name;
    public void hello (){
        System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다\n", name);
    }
}

class OverrideChild extends OverrideParent {


    // 메서드 재정의(오버라이딩)

    @Override
    public void hello(){
        System.out.printf("안녕못합니다.전 %s입니다.\n",name);
    }


}
