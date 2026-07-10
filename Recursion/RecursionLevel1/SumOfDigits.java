package Recursion.RecursionLevel1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]){
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ans=sumofDigit(n);
        System.out.println(ans);

    }
    public static int sumofDigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumofDigit(n/10);
    }
}
