import java.util.*;
public class HA23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first sdie of the triangle : ");
        double s1=sc.nextDouble();
        System.out.println("Enter the second side of the triangle : ");
        double s2=sc.nextDouble();
        System.out.println("Enter the third side of the triangle : ");
        double s3=sc.nextDouble();
        double s=(s1+s2+s3)/2;
        double a=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("The sides of the traingle is : (in meters)");
        System.out.println("Side 1 : "+s1+"m"+"\nSide 2 : "+s2+"m"+"\nSide 3 : "+s3+"m");
        System.out.println("The sum of all side of the triangle is : "+s+("m"));
        System.out.println("The area of the triangle is : "+a+"m");
        sc.close();
    }

}
