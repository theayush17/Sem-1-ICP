import java.util.*;
public class A5P8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter range :");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            System.out.print("(");
            for (int j=1;j<=i;j++){
                sum=sum+j;
                System.out.print(j);
                if (j<i)
                    System.out.print("+");
            }
            System.out.print(")");
            if (i<num)
                System.out.print(" + ");
        }
        System.out.print(" = "+sum);
        sc.close();
    }
}
