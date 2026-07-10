import java.util.Scanner;

public class SumOfNumber {
    //public static void calculationOfSum(int a , int b){
    //   int sum=a+b;
    //   System.out.println("Sum is: "+sum);
   // }
    public static int calculationOfSum(int num1 , int num2){
        int sum = num1+num2;
        System.out.println("Sum is: "+sum);
    return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        calculationOfSum(a,b);
    }
    
}
