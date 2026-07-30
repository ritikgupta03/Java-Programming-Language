package Array_List;

import java.util.ArrayList;

public class AlternateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length-1;i+=2){
            ans.add(arr[i]);

        }
        System.out.println(ans);

    }
}
