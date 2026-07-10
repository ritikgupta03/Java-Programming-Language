import java.util.*;
public class Parameter {
    public static void  printHelloWorld(){
        System.out.println("Hello World ");
    }



    public static  int CalcultionSum(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }   
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = CalcultionSum(a,b);

        System.out.println("Sum: "+sum);
       
        sc.close();
    } 
}