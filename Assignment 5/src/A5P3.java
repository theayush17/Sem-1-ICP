import java.util.*;
public class A5P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the first number : ");
        int f=sc.nextInt();
        System.out.print("Enter the second number : ");
        int l=sc.nextInt();
        int count=0;
        System.out.println("The number of prime number between "+f+" and "+l+" are :");
        for (int i=f;i<=l;i++){
            for (int j=1;j<=i;j++){
                if (i%j==0)
                    count++;
            }
            if (count==2){
                System.out.println(i+" is a prime number");
            }
            count=0;
        }
        sc.close();
    }    
}
