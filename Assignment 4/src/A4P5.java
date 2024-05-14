import java.util.*;
public class A4P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        int sum=0;
        int n=num;
        for (int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if (sum==n){
            System.out.println(num+" is a perfect number.");
        }
        else {
            System.out.println(num+" is not a perfect number.");
        }
        sc.close();
    }    
}
