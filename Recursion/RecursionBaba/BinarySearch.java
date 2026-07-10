package Recursion.RecursionBaba;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={5,7,11,13,15,17,36,54,96};
        int target=17;
        System.out.println(binarySearch(arr, target));
    }
    public static int binarySearch(int[] arr, int target){
        return helper(arr,target,0,arr.length-1);
    }
    //recusion----------
    public static int helper(int[] arr, int target, int left, int right){
        //base case---------
        if(left>right) return -1;

            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) return helper(arr, target, left, mid - 1);
            else return helper(arr, target, mid + 1, right);



//    public static int binarySearch(int[] arr,int target){
//        int left=0;
//        int right=arr.length-1;
//        while(left<right){
//            int mid=left+(right-left)/2;
//            if(arr[mid]==target) return mid;
//            else if(arr[mid]>target) return right=mid-1;
//            else left=mid+1;
//        }
//        return -1;
    }
}
