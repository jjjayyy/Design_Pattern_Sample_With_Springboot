package Creational_Pattern.Singleton;

public class Thread_Safe_Singleton {

    private static Thread_Safe_Singleton instance;

    private Thread_Safe_Singleton(){}

    public static synchronized Thread_Safe_Singleton getInstance(){
        if(instance == null){
            instance = new Thread_Safe_Singleton();
        }
        return instance;
    }

    public static Thread_Safe_Singleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (Thread_Safe_Singleton.class) {
                if(instance == null){
                    instance = new Thread_Safe_Singleton();
                }
            }
        }
        return instance;
    }
}
