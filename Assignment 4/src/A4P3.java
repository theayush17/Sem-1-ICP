import java.util.*;
public class A4P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        int ran;
        int avg;
        int sum=0;
        System.out.print("Randoms are: ");
        int i=1;
        do {
            Random ra=new Random();
            ran=ra.nextInt(1,num+1);
            System.out.print(ran+" ");
            sum=sum+ran;
            i++;
        } while (i<=num);
        System.out.println();
        avg=sum/num;
        System.out.println("Average of random numbers are : "+avg);
        
        sc.close();
    }    
}
