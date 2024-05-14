import java.util.*;
public class A4P9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        int sum=0;
        int n=num;
        int i=0;
        while(i<=n){
            int a=n%10;
            if (a!=0){
                sum=sum+(a*(int)(Math.pow(10,i)));
                i++;
            }
            n=n/10;
        }
        System.out.println("Before removing zeros : "+num);
        System.out.println("After removing zeros : "+sum);
        sc.close();
    }    
}
