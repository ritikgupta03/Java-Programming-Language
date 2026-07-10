package Arrays_Basic;

public class SecondMaximumValue {
    public static void main(String[] args) {
        int[] arr={11,5,6,2,8,3,5,19,11,8,9,87,19};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        //for the maximam vlaue
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max ) smax=arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
