package Strings;

public class PassingStringToMethod {
    public static void change(String s){
        s="Abhinav";
    }
    public static void main(String args[]){
        String s="Ritik Gupta";
        System.out.println(s);
        change(s);
        System.out.println(s);
        s="Himanshu Panday";
        System.out.println(s);
    }
}
//they are also umutable like array------------