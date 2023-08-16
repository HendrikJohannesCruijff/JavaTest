package Test;

import java.lang.reflect.Member;

public class SingletonTest {
    private static final SingletonTest instance = new SingletonTest();


    public static SingletonTest getInstance() {
        return instance;
    }
    private  SingletonTest() {

    }

}

