import java.util.*;
public class A2P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the distance in km : ");
        int d=sc.nextInt();
        int m=d*1000;
        int cm=d*100000;
        double ft=d*3280.8399;
        double in=d*39370.0787;
        System.out.println("Distance in (meters) : "+m);
        System.out.println("Distance in (inch) : "+in);
        System.out.println("Distance in (feet) : "+ft);
        System.out.println("Distance in (centimeter) : "+cm);
        sc.close();
    }
}
