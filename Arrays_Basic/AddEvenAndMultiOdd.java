package Arrays_Basic;

public class AddEvenAndMultiOdd {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1)
                arr[i] *= 2;
            else
                arr[i] += 10;
        }

        // Print updated array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}