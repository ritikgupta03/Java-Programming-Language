package Arrays_Basic;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        //multiplay by 2
        for(int i=0;i<arr.length;i++){
            arr[i] *=2;
        }
        //for Each loop---------------------
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
