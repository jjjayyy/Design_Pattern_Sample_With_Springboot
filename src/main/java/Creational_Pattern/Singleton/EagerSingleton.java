package Creational_Pattern.Singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public static String classLoadingMethod() {
        return "";
    }
}
