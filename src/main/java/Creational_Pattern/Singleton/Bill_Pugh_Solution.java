package Creational_Pattern.Singleton;

public class Bill_Pugh_Solution {

    private Bill_Pugh_Solution(){}

    private static class SingletonHelper{
        private static final Bill_Pugh_Solution INSTANCE = new Bill_Pugh_Solution();
    }

    public static Bill_Pugh_Solution getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
