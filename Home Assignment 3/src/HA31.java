import java.util.*;
public class HA31 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any number between 0 to 2");
    //  0 = Scissor
    //  1 = Rock
    //  2 = Paper
     int u=sc.nextInt();
     Random ra=new Random();
     int cp=ra.nextInt(0,3);
     System.out.println("User's Choice : "+u);
     System.out.println("Computer's Choice : "+cp);
     if (cp==u){
        System.out.println("Draw !!!");
     }
     else if ((cp==0 && u==2) || (cp==1 && u==0) || (cp==2 && u==1)){
        System.out.println("You lost !!!");
     }
     else if((cp==0 && u==1) || (cp==1 && u==2) || (cp==2 && u==0)){
        System.out.println("You Won !!!");
     }
     sc.close();   
    }
}
