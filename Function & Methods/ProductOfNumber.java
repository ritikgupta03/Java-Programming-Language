import java.util.Scanner;

public class ProductOfNumber {
    public static int multiply(int a , int b){
        int product=a*b;
       // System.out.println("Product of Number: "+product);
    return product;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod = multiply(a,b);
        System.out.println("Product of Number: "+prod);
        //int prod = multiply(30,5);
        //System.out.println("Product of Number: "+prod);
    }
}
