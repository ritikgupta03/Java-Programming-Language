package Strings;


public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Raghav");
        System.out.println(s.length()+" "+ s.capacity());

        StringBuilder a = new StringBuilder(); //16 ki zise hai
        System.out.println(a.length()+" "+ a.capacity());
        StringBuilder b = new StringBuilder(10);
        System.out.println(b.length()+" "+ b.capacity());

        StringBuilder c = new StringBuilder(6);
        System.out.println(c.length()+" "+ c.capacity());
        c.append("Radhav");
        System.out.println(c.length()+" "+ c.capacity());

        //set
        System.out.println(c);
        c.setCharAt(1,'o');
        System.out.println(c);

        //toString
        String t =s.toString();
        System.out.println(t);

        s.append("ndjlkfdlNDFJLfdfdjsdjnfnsdkkdsnskdnkdfk");
        System.out.println(s.length()+" "+s.capacity());

        //yaha se value change kar sakte hai
        s.append("garg");
        System.out.println(s);

    }
}
