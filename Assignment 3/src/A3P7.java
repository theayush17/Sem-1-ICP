import java.util.*;
public class A3P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total electricity units consumed : ");
        double u=sc.nextInt();
        System.out.print("Choose whether you want to pay online or not (Y/N) : ");
        char ch=sc.next().charAt(0);
        if (u<50){
            double a=u*3;
            double d1=a*(3.0/100);
            double d2=a-d1;
            if (ch=='Y' || ch=='y'){
                System.out.println("The total amount of monthly electric bill is Rs."+a);
                System.out.println("Discount : "+d1);
                System.out.println("Total amount payable : "+d2);
            }
            else {
                System.out.println("The total amount of monthly electric bill is Rs."+a);
            }
        }
        else if (u>=50 && u<200){
            double b=u*4.80;
            double d3=b*(3.0/100);
            double d4=b-d3;
            if (ch=='Y' || ch=='y'){
                System.out.println("The total amount of monthly electric bill is Rs."+b);
                System.out.println("Discount : "+d3);
                System.out.println("Total amount payable : "+d4);
            }
            else {
                System.out.println("The total amount of monthly electric bill is Rs."+b);
            }
        }
        else if (u>=200 && u<400){
            double c=u*5.80;
            double d5=c*(3.0/100);
            double d6=c-d5;
            if (ch=='Y' || ch=='y'){
                System.out.println("The total amount of monthly electric bill is Rs."+c);
                System.out.println("Discount : "+d5);
                System.out.println("Total amount payable : "+d6);
            }
            else {
                System.out.println("The total amount of monthly electric bill is Rs."+c);
            }
        }
        else if (u>=400){
            double d=u*6.20;
            double d7=d*(3.0/100);
            double d8=d-d7;
            if (ch=='Y' || ch=='y'){
                System.out.println("The total amount of monthly electric bill is Rs."+d);
                System.out.println("Discount : "+d7);
                System.out.println("Total amount payable : "+d8);
            }
            else {
                System.out.println("The total amount of monthly electric bill is Rs."+d);
            }
        }
        sc.close();
    }
}
