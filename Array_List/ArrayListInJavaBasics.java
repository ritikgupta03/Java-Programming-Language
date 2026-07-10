package Array_List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJavaBasics {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(52);
        arr.add(12);
        arr.add(56);
        arr.add(5);
        arr.add(99);
        System.out.println(arr);

        //for index print---------
        System.out.println(arr.get(2));
        arr.set(2,35); //index 2 pe badal denge value-----------
        System.out.println(arr);

        int n= arr.size();
        for(int i=0; i<n ;i++){
            System.out.print(arr.get(i)+ " "); //52 12 35 5 99
        }
        System.out.println();
        for(int elemt : arr){
            System.out.print(elemt +" "); //52 12 35 5 99

        }System.out.println();
        arr.add(86); //52, 12, 35, 5, 99, 86
        System.out.println(arr);
        arr.add(1,100); //52, 100, 12, 35, 5, 99, 86
        System.out.println(arr);
        //remove---------
        arr.remove(2); //remove 12--------
        System.out.println(arr);
        //last elemt delete---

        System.out.println(arr.remove(arr.size()-1));
        //System.out.println();

        Collections.reverse(arr);
        System.out.println(arr);
    }
}
