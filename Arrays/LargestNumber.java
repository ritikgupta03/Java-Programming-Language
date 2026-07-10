// WAP to find the largest number in a given array:--

import java.util.*;
public class LargestNumber {
    public static int largestNumber(int arr[]){
        int largest = Integer.MIN_VALUE; //-infinity
        for(int i=0 ; i<arr.length ; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,9,3,5};
        int find_largestNumber=largestNumber(arr);
        System.out.println("The Largest Value is: " + find_largestNumber);
    }
}

//Time Complexity is :-   O(n)
