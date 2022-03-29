package Creational_Pattern.Singleton;

import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    public void Eager_Initialization_Test() {
        // EagerSingleton 클래스 호출 여부 확인
        // jvm option : -verbose:class
        EagerSingleton.classLoadingMethod();
    }

}