import java.util.*;
public class A6P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter any string : ");
        String s=sc.nextLine();
        System.out.print("Enter the character which you want to count for a string : ");
        char c=sc.next().charAt(0);
        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==c)
                count++;
        }
        System.out.println("Number of times "+c+" occured in "+s+" is : "+count);
        sc.close();
    }    
}
