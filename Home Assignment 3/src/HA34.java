import java.util.*;
public class HA34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        boolean a=((num%5==0 && num%6==0)? true:false);
        boolean b=((num%5==0 || num%6==0)? true: false);
        System.out.println("Is "+num+" is divisible by 5 and 6 ? "+a);
        System.out.println("Is "+num+" is divisible by 5 or 6 ? "+b);
        System.out.println("Is "+num+" is divisible by 5 or 6, but not both ? "+b);
        sc.close();
    }
}
