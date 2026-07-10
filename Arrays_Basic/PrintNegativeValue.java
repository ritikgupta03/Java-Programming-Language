package Arrays_Basic;

import java.util.Scanner;

public class PrintNegativeValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n=sc.nextInt();
        System.out.print("Enter the Array Elements: ");
        int[] arr=new int[n];
        for(int i=0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0)
            System.out.print(arr[i]+" ");
        }
    }
}
