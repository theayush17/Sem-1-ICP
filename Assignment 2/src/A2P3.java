import java.util.*;
public class A2P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic salary: ");
        int salary=sc.nextInt();
        double da=salary*0.4;
        System.out.println("Dearness Allowances is "+da);
        double hra=salary*0.2;
        System.out.println("House Rent Allowance is "+hra);
        double gross=salary+da+hra;
        System.out.println("Gross Salary is "+gross);
        sc.close();
    }
}
