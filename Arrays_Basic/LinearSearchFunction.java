package Arrays_Basic;

public class LinearSearchFunction {
    public static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,10,5,20,6,30,7,40,8,50,60,70,80,90};
        int target=7;
        int index= linearSearch(arr,target);
        if(target==-1){
            System.out.println("NOT Found");
        }else{
            System.out.println("Key At Index: "+index);
        }
       // System.out.println(index);

    }
}
