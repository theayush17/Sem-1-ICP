import java.util.*;
public class A3P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total electricity units consumed : ");
        int u=sc.nextInt();
        if (u<50){
            System.out.println("The amount of monthly electric bill is Rs."+(3*u));
        }
        else if (u>=50 && u<200){
            System.out.println("The amount of monthly electric bill is Rs."+(4.80*u));
        }
        else if (u>=200 && u<400){
            System.out.println("The amount of monthly electric bill is Rs."+(5.80*u));
        }
        else if (u>=400){
            System.out.println("The amount of monthly electric bill is Rs."+(6.20*u));
        }
        sc.close();
    }
}
