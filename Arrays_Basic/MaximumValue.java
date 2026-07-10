package Arrays_Basic;

public class MaximumValue {
    public static void main(String[] args) {
        int[] arr={10,20,60,80,70,456,66,89,405,446,988,4546,49,54,55,89412,486,3212,15,456,4984,95645,455,4545,44};
        int max= arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.println(max);

    }
}
