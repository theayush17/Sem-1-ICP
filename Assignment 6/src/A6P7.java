import java.util.*;
public class A6P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string : ");
        String s=sc.nextLine();
        String upper=s.toUpperCase();
        char c[]=upper.toCharArray();
        char []vowels={'A','E','I','O','U'};
        int count =0;
        for (int i=0;i<c.length;i++){
            for (int j=0;j<vowels.length;j++){
                if (vowels[j]==c[i])
                count++;
            }
        }
        System.out.println("The number of vowels in "+s+" are : "+count);
        sc.close();
    } 
}
