import java.util.*;
public class A4P8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            Random ra=new Random();
            int c=ra.nextInt(0,11);
            System.out.print("User's guess : ");
            int u=sc.nextInt();
            System.out.println("Computer's guess : "+c);
            if (c==u){
                System.out.println("Good guess !!");
                break;
            }
            else if (c<u){
                System.out.println("Too high guess, try again !!");
            }
            else if (c>u){
                System.out.println("Too low guess, try again !!");
            }
        }
        sc.close();
    }
}
