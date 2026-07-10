public class LinearSearch {
    public static int linearSearch(int arr[] , int key){
        for(int i=0 ; i<arr.length ;i++){
            if(arr[i]==key){
                return i;
            }
        }return -1; //jab element na milega too -1 return karwa do:
    }

    public static void main(String[] args) {
        int arr[]={3,6,7,10,12,15,19,24};
        int key=10;
        int index = linearSearch(arr, key); //function call
        if(key==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("The key of index is: "+index);
        }
    }
}

//Time Complexity is :-   O(n)