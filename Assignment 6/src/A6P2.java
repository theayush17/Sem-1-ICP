import java.util.*;
public class A6P2 {
    public static void getPentagonalNumber(int n){
        System.out.println("Pentagonal Numbers are : ");
        for(int i=1;i<=n;i++){
            int p=(i*(3*i-1))/2;
            System.out.print(p+" ");
            if (i%10==0)
                System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n terms : ");
        int n=sc.nextInt();
        getPentagonalNumber(n);
        sc.close();
    }    
}
