package Test;

public class MemoryMemberRepository {
    public static void main(String[] args) {

    SingletonTest singletonTest1 = SingletonTest.getInstance();
    SingletonTest singletonTest2 = SingletonTest.getInstance();

        System.out.println(singletonTest1==singletonTest2);
    }

}
