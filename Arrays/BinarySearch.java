public class BinarySearch {
    public static int binarySearch(int arr[] , int key){
        int low=0 , high=arr.length-1;
        //check the low are greater than high
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){ //shift right
                low=mid+1;
            }else{      //shift left
                high= mid-1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        int key=12;
        int binary_Search =binarySearch(arr, key);
        System.out.println("The Index of key: " + binary_Search);
    }
}


//Time Complexity is :-   O( log n )