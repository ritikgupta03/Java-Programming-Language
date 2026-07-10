package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(16);
        arr.add(14);
        arr.add(12);
        arr.add(10);
        arr.add(18);
        System.out.println(arr);
        int i=0;
        int j=arr.size()-1;
        while(i<j){
            int temp= arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j,temp);
            i++;
            j--;

        }
        System.out.println("Reverse Arrays: " + arr);

        Collections.reverse(arr);
        System.out.println(arr);
        //ArrayList<String> arr2= new ArrayList<>();


    }
}
