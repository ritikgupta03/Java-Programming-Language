package Recursion.ZeroDayProblem;

public class NumbersExampleInRecursion {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(int n){
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //recursive call
        //if you calling a function again and again,you treate that sepreate that the stack....
        //its called the tail recurance
        print(n+1);
    }
}
