import java.util.*;
public class A5P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int f=sc.nextInt();
        System.out.print("Enter the second number : ");
        int l=sc.nextInt();
        for (int i=f;i<=l;i++){
            int mult;
            for (int j=1;j<=10;j++){
                mult=i*j;
                System.out.println(i+" x "+j+" = "+mult);
                
            }
            System.out.println(" ");
        }
        sc.close();
    }    
}
