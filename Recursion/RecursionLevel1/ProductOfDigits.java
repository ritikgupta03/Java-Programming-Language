package Recursion.RecursionLevel1;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String args[]){
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ans=productOfDigits(n);
        System.out.println(ans);

        /*
        int ans= productOfDigits(156);
        System.out.println(ans);

         */
    }
    public static int productOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * productOfDigits(n/10);
    }
}
