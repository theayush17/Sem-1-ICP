import java.util.*;
public class A3P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x=sc.nextInt();
        System.out.print("Enter the second number : ");
        int y=sc.nextInt();
        System.out.print("Enter the third number : ");
        int z=sc.nextInt();
        int l=((x>y && x>z)? x:(y>z)?y:z);
        int sl=((x>y && x<z)? x:(y>z)? z:y);
        System.out.println("Largest number among the three : "+l);
        System.out.println("Second largest number among the three : "+sl);
        sc.close();
    }
}
