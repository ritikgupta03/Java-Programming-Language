import java.util.*;
public class InputOutputInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size=sc.nextInt();
        //declare array
        int array[]=new int[size];
        System.out.println("Enter "+ size +" Elements: ");
        for(int i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        //display the array elememt
        System.out.println("The array element are: ");
        for(int i=0 ; i<size ; i++){
            System.out.print(array[i]+"  ");
        }
    }
}
