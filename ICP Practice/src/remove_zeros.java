import java.util.*;
public class remove_zeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        int sum=0;
        int x=0;
        int n=num;
        while (n>0){
            int b=n%10;
            if (b>0){
                sum=sum+(b*(int)Math.pow(10,x));
                x++;
            }
        n=n/10;
        }
        System.out.println("Previous Number : "+num+"\nNew Number : "+sum);
        sc.close();
    }
}
