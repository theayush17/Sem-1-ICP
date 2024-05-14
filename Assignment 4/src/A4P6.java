import java.util.*;
public class A4P6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the base number : ");
        int base =sc.nextInt();
        System.out.print("Enter the power : ");
        int power=sc.nextInt();
        int product=1;
        for (int i=1; i<=power;i++){
            product=product * base;
        }
        System.out.println("Value of the base "+base+" to the power "+power+" is "+product);
        sc.close();
    }    
}
