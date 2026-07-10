package Arrays_Basic;

import java.util.Arrays;

public class SallowCopyAndDeepCopy {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
//        int[] x=arr; //sallow copy of arraysss----
//        x[0]=100;
        int[] y= Arrays.copyOf(arr,arr.length);
        y[0]=100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
