import java.util.*;
public class A2P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a degree in Fahrenheit : ");
        double Farh=sc.nextDouble();
        double c =(Farh-32)*(5.0/9);
        System.out.println("Fahrenheit is "+Farh+" Celsius is "+c);
        sc.close();
    }
}
