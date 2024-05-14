import java.util.*;
public class A2P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter second number : ");
        int b=sc.nextInt();
        System.out.println("a \t\t\tb\t\t\tpow(a,b)");
        System.out.println(a+"\t\t\t"+b+"\t\t\t"+(int)Math.pow(a,b));
        a=a+1;b=b+1;
        System.out.println(a+"\t\t\t"+b+"\t\t\t"+(int)Math.pow(a,b));
        a=a+1;b=b+1;
        System.out.println(a+"\t\t\t"+b+"\t\t\t"+(int)Math.pow(a,b));
        a=a+1;b=b+1;
        System.out.println(a+"\t\t\t"+b+"\t\t\t"+(int)Math.pow(a,b));
        a=a+1;b=b+1;
        System.out.println(a+"\t\t\t"+b+"\t\t\t"+(int)Math.pow(a,b));
        sc.close();
    }
}
