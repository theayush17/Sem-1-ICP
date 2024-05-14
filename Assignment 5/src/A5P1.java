import java.util.*;
public class A5P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter second number : ");
        int num2=sc.nextInt();
        int sum=0; int sum1=0;
        for (int i=1;(i<=num1/2);i++){
            if (num1%i==0){
                sum=sum+i;
            }
        }
        for (int i=1;(i<=num2/2);i++){
            if (num2%i==0){
                sum1=sum1+i;
            }
        }
        System.out.println("The proper divisor of "+num1+" is : "+sum);
        System.out.println("The proper divisor of "+num2+" is : "+sum1);
        if ((sum==num2) && (sum1==num1))
            System.out.println(num1+" and "+num2+" are amicable numbers.");
        else 
            System.out.println(num1+" and "+num2+" are not amicable numbers.");
        sc.close();
    }    
}
