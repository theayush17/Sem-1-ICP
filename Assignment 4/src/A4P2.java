import java.util.*;
public class A4P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        int sum=0;
        int n=num;
        int i=1;
        while(i<=n){
            int x=n%10;
            sum=sum+x;
            n=n/10;
        }
        if (sum%9==0){
            System.out.println("Integer "+num+" is divisible by 9.");
        }
        else
        System.out.println("Integer "+num+" is not divisible by 9.");
        sc.close();
    }
}
