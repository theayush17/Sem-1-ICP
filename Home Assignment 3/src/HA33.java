import java.util.*;
public class HA33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ra=new Random();
        int comp=ra.nextInt(1,13);
        String s1="";
        switch (comp){
            case 1:
                s1="January";
                break;
            case 2:
                s1="February";
                break;
            case 3:
                s1="March";
                break;
            case 4:
                s1="April";
                break;
            case 5:
                s1="May";
                break;
            case 6:
                s1="June";
                break;
            case 7:
                s1="July";
                break;
            case 8:
                s1="August";
                break;
            case 9:
                s1="September";
                break;
            case 10:
                s1="October";
                break;
            case 11:
                s1="November";
                break;
            case 12:
                s1="December";
                break;
            default:
                break;
        }
        System.out.println("Computer's Choice is "+comp+" and the month is "+s1);
        sc.close();
    }
}
