package CRT_TRANING.DAY1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int flag=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("Not Prime Number");
                flag=1;
                return;
            }else{
                System.out.println("Prime Number");
            }
        }
    }
}
