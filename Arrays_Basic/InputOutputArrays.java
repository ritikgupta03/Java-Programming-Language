package Arrays_Basic;
import java.util.*;
public class InputOutputArrays {
    public static void main(String[] args) {
//        int[] x={10,20,30,40,50,60,-80};
//        for(int i=0 ; i<=x.length-1;i++){
//            System.out.print(x[i]+" ");
//        }

        Scanner sc = new Scanner(System.in);
        int[] arr1=new int[7];
        for(int i=0 ; i<7 ;i++){
            arr1[i]=sc.nextInt();
        }
        //print
        for(int i=0;i<7;i++){
            System.out.print(arr1[i]+ " ");

            System.out.print(2*arr1[i]+ " ");
        }

//
//        System.out.print("Enter The Size Of Arrays: ");
//        int size= sc.nextInt();
//
//        int[] arr= new int[size];
//        System.out.println("Enter the Value: ");
//        for(int i=0; i<size; i++){
//
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0; i<=arr.length-1;i++){
//            System.out.print(arr[i]+" ");
//        }



    }
}
