import java.util.*;
public class A3P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b= sc.nextInt();
        System.out.print("Enter the third number : ");
        int c= sc.nextInt();
        if (a>b && b>c)
            System.out.println("Decreasing");
        else if (a<b && b<c)
            System.out.println("Increasing");
        else
            System.out.println("Neither increasing nor decreasing");
            sc.close();
    }
}
