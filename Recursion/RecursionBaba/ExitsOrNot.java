package Recursion.RecursionBaba;

public class ExitsOrNot {
    public static void main(String[] args) {
        int[] arr={10,15,20,25,30,35,40,45,50,55,60};
        int target=30;
        System.out.println(exits(arr,target,0));
    }
    public static boolean exits(int[] arr, int target, int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==target) return true;
        else return exits(arr,target,idx+1);
    }


}
