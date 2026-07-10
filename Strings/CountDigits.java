package Strings;

import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]){
        double d=3.14;
        String s1="raghav";
        s1 +=d;
        System.out.println(s1);

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s = "" + n;
        System.out.println(s.length());


        //double
        double n1=sc.nextDouble();
        String s2= "" + n1;
        System.out.println(s2.length());

    }
}
