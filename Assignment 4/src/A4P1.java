import java.util.*;
public class A4P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b=sc.nextInt();
        System.out.print("Enter the adding number : ");
        int c=sc.nextInt();
        int sum=0;
        for (int i=a;i<=b;i=i+c){
            sum=sum+i;
            System.out.println(i);
        }
        System.out.println("The sum of numbers between "+a+" and "+b+" is "+sum);
        sc.close();
    }
}
