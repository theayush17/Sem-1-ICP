import java.util.*;
public class HA44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range :");
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        for (int i=1;i<=n;i++){
            if (i%2==0)
                even=even+i;
            else
                odd=odd+i;
        }
        System.out.println("Sum of even numbers between 1 and "+n+" is "+even);
        System.out.println("Sum of odd numbers between 1 and "+n+" is "+odd);
        sc.close();
    }
}
