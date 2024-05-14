import java.util.*;
public class A4P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        System.out.println("The multiplication table of "+num+" is : ");
        for (int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
        System.out.println();
        sc.close();
    }    
}
