package Recursion.ZeroDayProblem;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,55,66,75,89};
        int target=4;
        System.out.println (binarySearch(arr,target,0,arr.length-1));
    }
    public static int binarySearch(int [] arr , int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid= start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return binarySearch(arr,target,start,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);
    }
}

/*
package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 75, 89};
        int target = 4;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        // base condition: if start > end, target not found
        if (start > end) {
            return -1;
        }

        // find middle index
        int mid = start + (end - start) / 2;

        // if target found at mid
        if (arr[mid] == target) {
            return mid;
        }

        // if target is smaller than mid element, search left half
        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }

        // else search right half
        return binarySearch(arr, target, mid + 1, end);
    }
}
*/