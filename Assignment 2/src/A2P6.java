import java.util.*;
public class A2P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of seconds : ");
        double s=sc.nextDouble();
        double g=32.174;
        double d=(0.5)*g*Math.pow(s,2);
        System.out.println("Distance traveelled : "+d);
        sc.close();
    }
}
