import java.util.Scanner;

public class FactorialOfNumber {
    public static int factorialNumber(int n){
        int fact=1;
        for(int i=2 ; i<=n ; i++){
            fact=fact*i;
            //System.out.println(fact);
        }
        return fact;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Of N: ");
        int n=sc.nextInt();
        int factorial = factorialNumber(n);
        System.out.println("Factorial of "+n+": "  + factorial);
    }
    
}
