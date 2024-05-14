import java.util.*;
public class A6P9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter your password : ");
        String pass=sc.nextLine();
        char intoPass[] =pass.toCharArray();
        boolean b= false;

        // first condition to satisfy that if password is atleat 8 characters
        if (intoPass.length>7){
            for (int i=0;i<intoPass.length;i++){

            // second condition to satisfy that if password is conataing only letters and digits
                if(intoPass[i]>='0' || intoPass[i]<='9' || intoPass[i]>='A' || intoPass[i]<='Z' || intoPass[i]>='a' || intoPass[i]<='z' )
                    b= true;

                else 
                    b= false;
            // third condition is to satisfy that there must me two digits conatining the password
                int count =0;
                for (int j=0;j<intoPass.length;j++){
                    if (intoPass[j]>='0' && intoPass[j]<='9')
                        count++;
                }

                if(count>=2)
                    b=true;
                else
                    b=false;

                    
            }
        }
        else 
            b=false;

        // now check whether the password is correct or not
        if (b==true)
            System.out.println("VALID PASSWORD !!");
        else
            System.out.println("INVALID PASSWORD");

        sc.close();
    }
        
}
