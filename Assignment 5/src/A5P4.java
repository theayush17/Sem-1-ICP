import java.util.*;
public class A5P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the first number : ");
        int f=sc.nextInt();
        System.out.print("Enter the second number : ");
        int l=sc.nextInt();
        for (int i=f;i<=l;i++){
            int prd=1;
            for (int j=1;j<=i;j++){
                prd=prd*j;
            }
            System.out.println("Factorial of "+i+" is : "+prd);
        }
        sc.close();
    }    
}
