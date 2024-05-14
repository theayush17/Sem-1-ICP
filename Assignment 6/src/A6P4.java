import java.util.*;
public class A6P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter from year to year to calculate the total days :");
        int year1=sc.nextInt();
        int year2=sc.nextInt();
        int days=0;
        numberOfDaysInAYear(year1,year2,days);
        sc.close();
    }   
    public static int numberOfDaysInAYear(int year1, int year2, int days){
        for(int i=year1;i<year2;i++){
            if (i%4==0 && i%100!=0||i%400==0)
                days=days+366;
            days=days+365;
        }
        System.out.println(days);
        return days;
    } 
}
