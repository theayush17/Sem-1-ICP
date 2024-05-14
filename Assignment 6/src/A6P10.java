import java.util.*;
public class A6P10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the base and height of triangle: ");
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        System.out.print("Enter the sides of square: ");
        double sides=sc.nextDouble();
        System.out.print("Enter the radius of circle: ");
        double radius=sc.nextDouble();
        System.out.println(triangle(base,height));
        System.out.println(square(sides));
        System.out.println(circle(radius));
        sc.close();
    }    
    static double triangle(double base, double height){
        double area=(1.0/2)*base*height;
        return area;
    }
    static double square(double sides){
        double area=Math.pow(sides, 2);
        return area;
    }
    static double circle(double radius){
        double area=Math.PI*(Math.pow(radius,2));
        return area;
    }
}
