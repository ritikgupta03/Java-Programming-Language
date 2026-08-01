package Arrays_Basic;
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,5};
        int n=arr.length;
   //-------------------- method--1------------------------------------
//        int sum=n*(n+1)/2;
//        int arrSum=0;
//        for(int i=0;i<n;i++){
//            arrSum+=arr[i];
//        }
//        int missingnumber=sum-arrSum;
//        System.out.print(missingnumber);


        //-------------------- method--2------------------------------------
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=i){
                System.out.print(i);
                return;
            }
        }
        //if not found---
        System.out.print(arr.length);
    }
}
