import java.util.*;
public class HA21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the total minutes : --should be equal to aur greater than 526004 minutes-- ");
        int m=sc.nextInt();

        if (m >= 526004) {
            double d = (365.0 / 526003.2) * m;
            double y = d / 365;
            System.out.println("The number of minutes taken by the user : " + m + "\nThe number of days are = " + (int) d + "\nThe number of years are = " + (int) y);

        }
        else {
                System.out.println("Enter the correct value i.e. the minutes should be greater than or equal to 526004");
        }
        sc.close();
    }
}
