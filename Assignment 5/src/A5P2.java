import java.util.*;
public class A5P2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter any number : ");
        int num =sc.nextInt();
        int sum=0;
        int n=num;
        int count=0;
        int count1=0;
        while (n!=0){
            int a=n%10;
            sum=(sum*10)+a;
            n=n/10;
        }
        if (num<2 && sum<2){
            System.out.println(num+" is not a twisted prime number.");
        }
        else {
            for (int i=1;i<num/2;i++){
                if(num%i==0)
                    count++;
            }
            for (int i=1;i<sum/2;i++){
                if(sum%i==0)
                    count1++;
            }
        }
        if (count>1 && count1>1)
            System.out.println(num+" is not a twisted prime number.");
        else 
            System.out.println(num+" is a twisted prime number.");
        sc.close();
    }    
}
