package Strings;

public class BuiltInMethod {
    public static void main(String args[]){
        String s="Gulshan Kumar";
        System.out.println(s.indexOf('h'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.indexOf('y')); //not present return -1;

        //too uppercase------------
        System.out.println(s.toUpperCase());

        //too lowercase-------------
        System.out.println(s.toLowerCase());

        //tooo contains matlb ki substring Ritik-------Rit means true;
        String str="harshita";
        System.out.println(str.contains("harsh"));
        if(str.contains("rshita")){
            System.out.println("Happy");
        }
        System.out.println(str.startsWith("harsh"));
        System.out.println(str.startsWith("arsh"));
        System.out.println(str.endsWith("shita"));

        ////String  to integer--------
        String str2 ="4554455";
        int n = Integer.parseInt(str2);
        System.out.println(n+1);

    }
}
