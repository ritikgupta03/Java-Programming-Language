package Strings;

public class SubStringsOfString {
    public static void main(String[] args) {

        //print all substrings---------------
        String str ="gopi";
        for(int i=0 ; i<str.length();i++){
            for(int j=i+1 ; j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();

        }



        String s= "Jaishankar";
      //  String a="abc"; //subset of abc is--- a b c ab ac bc abc
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,7));
        System.out.println(s.substring(0));
        System.out.println(s.substring(1,s.length()-1));

//        String s= "ritikaaaaaaaaa";
//        System.out.println(s);
//        s = "Ritikaa";
//        System.out.println(s);


    }
}
