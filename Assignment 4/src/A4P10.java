import java.util.*;
public class A4P10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int n=num;
        int i=3;
        int pow=1;
        while (true){
            pow =pow*i;
            if (pow>n){
                int x=pow/3;
                System.out.println("The largest power of 3 less than or equal to "+num+" is "+x);
                break;
            }       
        }
        sc.close();
    }    
}
