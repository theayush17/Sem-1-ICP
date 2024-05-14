import java.util.*;
public class HA32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number between 0 to 6 : ");
        // 0= Sunday   1= Monday  2= Tuesday  3=Wednesday  4= Thursday  5= Friday  6= Saturday
        int day=sc.nextInt();
        String s1="";
        if(day==0){
            s1="Sunday";
        }
        else if (day==1){
            s1="Monday";
        }
        else if (day==2){
            s1="Tuesday";
        }
        else if (day==3){
            s1="Wednesday";
        }
        else if (day==4){
            s1="Thursday";
        }
        else if(day==5){
            s1="Friday";
        }
        else if(day==6){
            s1="Saturday";
        }
        System.out.print("Enter the number of days elapsed : ");
        int elap=sc.nextInt();
        String s2="";
        int future = (day+elap)%7;
        switch (future) {
            case 0:
                s2="Sunday";
                break;
            case 1:
                s1="Monday";
                break;
            case 2:
                s1="Tuesday";
            case 3:
                s2="Wednesday";
                break;
            case 4:
                s2="Thursday";
                break;
            case 5:
                s2="Friday";
                break;
            case 6:
                s2="Saturday";
                break;
            default:
                break;
        }
        System.out.println("Today is "+s1+" and the future day is "+s2);

        sc.close();
    }
}
