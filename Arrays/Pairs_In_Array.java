//WAP to print a pair in an Array...........

import java.util.*;
public class Pairs_In_Array {
    public static void printPairsArray(int arr[]){
        int totalPair=0;
        for(int i=0 ; i<(arr.length-1) ; i++){
            int current =arr[i];                  // 2,4,6,8,10
            for(int j=i+1 ; j<arr.length ; j++){
                System.out.print("(" + current + "," + arr[j] + ")");
                totalPair++;
            }
            System.out.println();
            
        }
        System.out.println("The Total Pair is: "+totalPair );
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printPairsArray(arr);
        
    }
}
