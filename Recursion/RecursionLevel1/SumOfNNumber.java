package Recursion.RecursionLevel1;
import java.util.*;

public class SumOfNNumber {
    public static void main(String args[]){
        System.out.print("Enter the number of n: ");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ans=sumofnumber(n);
        System.out.println(ans);
    }
    public static int sumofnumber(int n){
        if(n<=1){
            return 1;

        }
        return n+sumofnumber(n-1);
    }
}
