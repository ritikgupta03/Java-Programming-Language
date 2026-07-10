package Recursion.RecursionBaba;

public class GlobleVariable {
    static int x =10;
    public static void main(String[] args) {
        // int x=10;
        change();
        System.out.println(x);
    }
    public static void change(){
        x=20;
    }


}
