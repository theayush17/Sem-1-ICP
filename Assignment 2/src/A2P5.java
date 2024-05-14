import java.util.*;
public class A2P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the radius of the Hemisphere : ");
        int radius = sc.nextInt();
        double sa=3*Math.PI*Math.pow(radius,2);
        System.out.println("Surface Area of Hemisphere is : "+sa);
        double vol=(2/3)*Math.PI*Math.pow(radius,3);
        System.out.println("Volume of Hemisphere is : "+vol);
        sc.close();
    }
}
