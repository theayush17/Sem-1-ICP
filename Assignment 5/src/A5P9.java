import java.util.*;
public class A5P9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range : ");
        int num=sc.nextInt();
        double sum=0;
        for (int i=1;i<=num;i++){
            sum=sum+(1.0/(Math.pow(i,2)));
            System.out.print("1/"+i+"²");
            if (i<num)
                System.out.print(" + ");
        }
        System.out.print(" = "+sum);
        sc.close();
    }
}
