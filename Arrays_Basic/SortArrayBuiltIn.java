package Arrays_Basic;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int[] arr={10,-2,60,52,-48,7,68,9,6,3,2,1,4,5,69,8,7,4,1,23,6,5,8,8,94,-51,2,33,6,5,4,7,9,52,3,6,2,7,8,6,11};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
