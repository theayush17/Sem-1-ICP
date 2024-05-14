import java.util.*;
public class A3P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the total ml of water Alice drank : ");
        double w=sc.nextInt();
        if (w>=5000){
            System.out.println("Yes, Alice is following doctor’s advice");
        }
        else {
            System.out.println("No, Alice is not following doctor’s advice");
        }
        sc.close();
    }
}
