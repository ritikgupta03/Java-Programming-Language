package Arrays_Basic;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={9,8,5,6,7,3,1,44,56,73,49,5};
        int target=5;
        boolean found=false;
        for(int i=0; i<arr.length-1 ;i++){
            if(arr[i]==target){
                found=true;
                break;
            }
        }
        if(found==true) System.out.print("Arrays mai Target value hai...");
        else System.out.print("Arrays mai Target Value Nhi hai");
    }

}
