import java.util.*;
public class HA35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String s1=sc.nextLine();
        System.out.print("Enter your last name : ");
        String ln=sc.nextLine();
        System.out.print("Enter your age : ");
        int age=sc.nextInt();
        System.out.print("What is your gender ? M/F ");
        char g= sc.next().charAt(0);
//asks whether he or she and then processes and print the required output
        if(g=='M' || g=='m'){
            System.out.println("First name : "+s1+"\nLast name : "+ln+"\nAge : "+age);
            if (age>20)
                System.out.println("Then i shall call you Mr. "+s1);
            else 
                System.out.println("Then i shall call you "+s1+" "+ln);
        }
        else{
            System.out.println("First name : "+s1+"\nLast name : "+ln+"\nAge : "+age);
            if (age>20){
                System.out.println("You are married or not ? Y/N ");
                char m=sc.next().charAt(0);
                if (m=='Y' || m=='y'){
                    System.out.println("Then i shall call you Mrs. "+s1);
                }
                else{ 
                    System.out.println("Then i shall call you Ms. "+s1+" "+ln);
                }
            }
            else {
                System.out.println("I should call you "+s1+" "+ln);
            }
        }
            sc.close();
        }
        
    }    

