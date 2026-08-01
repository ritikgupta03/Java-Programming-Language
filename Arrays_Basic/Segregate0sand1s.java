package Arrays_Basic;
import java.util.*;
public class Segregate0sand1s {
    public static void main(String[] args) {
//        //----------Method 1 ---- Two Pointer Approch------------------------
           int arr[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
//        int i=0;
//        int j=arr.length-1;
//        while(i<j){
//            if(arr[i]==0) i++;
//            else if(arr[j]==1) j--;
//            else if(arr[i]==1 && arr[j]==0){
//                arr[i]=0;
//                arr[j]=1;
//                i++;
//                j--;
//
//            }
//        }
//        System.out.println(Arrays.toString(arr));


        //----------Method 2 ---- Counting Approch------------------------
        int countZero = 0;

        for (int ele : arr) {
            if (ele == 0) {
                countZero++;
            }
        }

        for (int i = 0; i < countZero; i++) {
            arr[i] = 0;
        }

        for (int i = countZero; i < arr.length; i++) {
            arr[i] = 1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
