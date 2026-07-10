package Arrays_Basic;

public class ReverseNumberArray2 {
    public static void main(String[] args) {
        int[] arr={91,20,30,40,50,65,97,80,89};

        int n=arr.length;
        for(int i=0;i<n/2;i++){
            //swap arr[i] and arr[n-1-i]----------
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}
