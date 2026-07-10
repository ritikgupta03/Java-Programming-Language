package Arrays_Basic;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={91,20,30,40,50,65,97,80,89};
        int i=0;
        int j=arr.length-1;
        System.out.print("Original Array: ");
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println();
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.print("Reverse Element: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
