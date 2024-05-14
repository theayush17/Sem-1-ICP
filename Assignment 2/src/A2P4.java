import java.util.*;
public class A2P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer between 0 to 1000 : ");
        int num=sc.nextInt();
        int x=num%10;
        num/=10;
        int y=num%10;
        num/=10;
        int z=num%10;
        num/=10;
        int sum=x+y+z;
        System.out.println("The sum of digits : "+sum);
        sc.close();
    }
}
