import java.util.*;
public class A6P8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string : ");
        String s=sc.nextLine(); String s1=""; char c;
        for (int i=s.length()-1;i>=0;i--){
            c=s.charAt(i);
            s1=s1+c;
        }
        System.out.println("Before reversing the string : "+s+"\nAfter reversing : "+s1);
        if (s==s1)
            System.out.println(s+" is Palindrome");
        sc.close();
    }    
}
