//Write a Java method to compute the average of three numbers..

public class AverageOfNumber {
    public static float averageNumber(float a , float b , float c){
    float average= (a+b+c/3);
    System.out.println("Average Number: "+ average);

    return average;
    }
    public static void main(String args[]){
        float a=10;
        float b=30;
        float c=40;
        averageNumber(a,b,c);
    }
}
