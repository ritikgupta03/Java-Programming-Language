package Strings;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String name= "Devesh";
        StringBuilder sb=new StringBuilder(name);
        sb.reverse();
        System.out.println(sb);
//Algorithim of reverse  String--------------
        StringBuilder sb1=new StringBuilder(name);
        int i=0;
        int j=sb1.length()-1;
        while(i<=j){
            char temp1=sb1.charAt(i);
            char temp2=sb1.charAt(j);
            sb1.setCharAt(i,temp2);
            sb1.setCharAt(j,temp1);
            i++;
            j--;

        }
        System.out.println(sb1);

        //reverse------------
        String name1= "Aditya84848%^&*()";
        StringBuilder sb2=new StringBuilder(name1);
        sb2.reverse();
        name1 =sb2.toString();
        System.out.println(name1);


    }
}
