import java.util.*;
public class A3P5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the year : ");
        int year=sc.nextInt();
        if (year%4==0 && year/100==0 || year%400==0){
            System.out.println(year+" is a leap year : True");
        }
        else {
            System.out.println(+year+" is a leap year : False");
        }
        sc.close();
    }
}
