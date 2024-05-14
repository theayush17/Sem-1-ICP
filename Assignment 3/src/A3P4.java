import java.util.*;
public class A3P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any number between 1 to 9 : ");
        int num=sc.nextInt();
        Random ra=new Random();
        int a=ra.nextInt(1,10);
        System.out.println("User's choice : "+num);
        System.out.println("Computer's choice : "+a);
        if (num==a){
            System.out.println("You got it right");
        }
        int x=num+1;
        int y=num-1;
        if (a==x || a==y){
            System.out.println("You got it almost");
        }
        else {
            System.out.println("You got it wrong");
        }
        sc.close();
    }
}
