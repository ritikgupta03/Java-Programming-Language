package Arrays_Basic;

import java.util.Scanner;

public class SumAndMultiOfArrayNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr= new int[size];
        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        //Sum of Arrays--------
        int sum=0;
        for(int i=0 ; i<size;i++)
            sum +=arr[i];
        System.out.print("Sum Of Array: " +sum);
        System.out.println();

        // Multiplication of Array
        int mul = 1;

        for(int i = 0; i < size; i++)
            mul *= arr[i];

        System.out.print("Multiplication Of Array: " + mul);
    }
}
