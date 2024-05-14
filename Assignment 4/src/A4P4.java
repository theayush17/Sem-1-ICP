import java.util.*;
public class A4P4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lowest number : ");
        int s=sc.nextInt();
        System.out.print("Enter the highest number : ");
        int l=sc.nextInt();
        int x=s;
        int y=l;
        while (x!=0){
            int a=y%x;
            y=x;
            x=a;
        }
        System.out.println("GCD "+y);  
        sc.close();
    }
    
}