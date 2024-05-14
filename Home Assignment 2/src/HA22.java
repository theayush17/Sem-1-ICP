import java.util.*;
public class HA22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of eggs she has : ");
        System.out.println("--number of eggs should be greater than or equal to 144--");
        int e=sc.nextInt();
        if (e>=144){
            int g=144;
            int d=e/12;
            int l=e%12;
            int gross=e/g;
            System.out.println("The total number of eggs she has = "+e+"\nThe dozen of eggs she has = "+d+"\nThe no of eggs she left with = "+l);
            System.out.println("The Gross is : "+gross);
        }
        else{
            System.out.println("Run the program again and enter the number of eggs as per the instruction given at the earliest");
        }
        sc.close();
    }
}
