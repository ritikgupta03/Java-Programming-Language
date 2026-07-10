public class Reverse_In_Array {
    public static void reverseArray(int arr[]){
        int low=0 , high=arr.length-1;
        while(low < high){
            int temp = arr[high]; //store high--->temp 
            arr[high] = arr[low]; //store low---->high
            arr[low] = temp;      //store low----> temp
            low++;
            high--; 
        }
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,60};
        reverseArray(arr);
        System.out.print("[ ");
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print(" ]");   
    }
}



//Time Complexity is :-   O(n)
    

