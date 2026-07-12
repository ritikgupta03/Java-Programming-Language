package Recursion.RecursionBaba;

public class PreInPost {
    public static void main(String[] args) {
        pip(3);
    }

    public static void pip(int n) {
        if(n==0) return;
        System.out.print(n+" "); //pre
        pip(n-1);
        System.out.print(n+" "); //In
        pip(n-1);
        System.out.print(n+" "); //post
    }
}

//n=1----------output is= 1 1 1
//n=2----------output is= 2 1 1 1 2 1 1 1 2
//n=3----------output is= 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3