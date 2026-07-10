package Strings;

public class Plus {
    public static void main(String args[]){
        String s="abhishek";
        //s = s+" hi hero hai";
        s +=" hi hero hai";
        s +=10;
        s += 'a';
        s += '\0';
        s +='\n';
        s +='n';
        System.out.println(s);

        System.out.println("Raghav"+10+20); //Raghav1020
        System.out.println(10+20+"Ritik");
        System.out.println(10+"Ritik"+20);
        System.out.println("Raghav"+(10+20));
        System.out.println('A'+"isha");
        System.out.println('A'+2+"Isha");
    }
}
