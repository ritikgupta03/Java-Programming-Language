package Strings;

public class StringEquals {
    //create the function--------
    public static boolean equals(String str1,String str2){
        if(str1.length() != str2.length()) return false;
        for(int i=0;i<=str1.length();i++){
            if(str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //function ke liye output---------
        String str1= new String("Abhishek");
        String str2= new String("Abhishek");
        System.out.println(str1.equals(str2));



        String a=new String("Raghav");
        String b=new String("Raghav");
        System.out.println(a==b); //false
        System.out.println(a.charAt(0)==b.charAt(0)); //true
        System.out.println(a.equals(b)); //true


        String s1="Ritik";
        String s2="Ritik";
        System.out.println(s1==s2); //true
        System.out.println(s1.charAt(0)==s2.charAt(0)); //true
        System.out.println(s1.equals(s2));
    }
}
