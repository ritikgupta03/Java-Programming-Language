package Arrays_Basic;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int x[]={10,20,30,40,50,60};
        System.out.println(x[2]);
        change1(x);
        System.out.println(x[2]);
    }
    public static void change1(int[] x){
        x[2]=90;
    }

}
