package Recursion.RecursionLevel1;

public class Print1toN {
    public static void main(String args[]){
        funRev(5);
    }
    public static void funRev(int n){
        if(n==0){
            return;

        }
        funRev(n-1);
        System.out.println(n);
    }
}
