package Recursion.RecursionBaba;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(4,'A','B','C');
    }

    private static void hanoi(int n, char src, char helper, char dest) {

        //dekho phla case kya ho sakta hai ki hame------- a[src] to b[helper] via c[dest] -------leke jana hai
        //dusra case a to c---------
        //third case hame b to c jana hai via a---------
        if(n==0) return;
        hanoi(n-1,src,dest,helper);
        System.out.println(src+" -> "+dest);
        hanoi(n-1,helper,src,dest);
    }
}
