import java.util.*;
public class A6P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("No of sides of a polygon : ");
        int n=sc.nextInt();
        System.out.print("Enter the length of the sides : ");
        double sides=sc.nextDouble();
        area(n,sides);
        sc.close();
    }
    public static double area(int n, double sides){
        double area=(n*(Math.pow(sides,2)))/(4*(Math.tan((Math.PI)/n)));
        System.out.println("Area of a polygon : "+area);
        return area;
    }
}
