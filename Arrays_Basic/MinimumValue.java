package Arrays_Basic;

public class MinimumValue {
    public static void main(String[] args) {
        int[] arr= {10,20,30,55,2,6,66,99,5,88,4,45,4,-999,55,5,45,8,6,6,56,5,655,45,44,754,7557,455,66,55,1,868,5,68,56,8,56,5,56,46,46,79,9,78,7,98,465,13,23,12};
        int min= Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min) min=arr[i];

        }
        System.out.println(min);
    }
}
