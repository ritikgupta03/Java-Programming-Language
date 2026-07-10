package Strings;

public class CompareToStringMethods {
    public static int compareTo(String u , String v){

        return -1;

    }
    public static void main(String args[]){
        String a="raghav";
        String b="meena";
        System.out.println(a.compareTo(b));

        //function value---------
        String u="gitanjali";
        String v="alok";
        System.out.println(compareTo(u,v));

        //yaha pe accie value se -ve hota hai----
        String x="harmit";
        String y="harsh";
        System.out.println(x.compareTo(y));

        /// yaadi value string same ho jata hai
        //to jitna chacter bacha hau hai value likh dena hai

        String m="harshitam";
        String n="harsh";
        System.out.println(m.compareTo(n));

        //add to both name in same line ---concat---

        System.out.println(m.concat(n));
        m.concat(n);
        System.out.println(m);
        String l=m.concat(n);
        System.out.println(l);
        //very easy concat----------
        m=m+n;
        System.out.println(m);
    }

}
