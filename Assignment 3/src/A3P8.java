import java.util.*;
public class A3P8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the x-coordinate : ");
        int x=sc.nextInt();
        System.out.print("Enter the y-coordinate : ");
        int y=sc.nextInt();
        if (x>0 && y>0){
            System.out.println("( "+x+","+y+" )"+" is on I quadrant");
        }
        else if (x>0 && y<0){
            System.out.println("( "+x+","+y+" )"+" is on IV quadrant");
        }
        else if (x<0 && y<0){
            System.out.println("( "+x+","+y+" )"+" is on III quadrant");
        }
        else if (x<0 && y>0){
            System.out.println("( "+x+","+y+" )"+" is on II quadrant");
        }
        else if (x==0 && y>0 || y<0){
            System.out.println("( "+x+","+y+" )"+" is on the y-axis");
        }
        else if (y==0 && x>0 || x<0){
            System.out.println("( "+x+","+y+" )"+" is on the x-axis");
        }
        else {
            System.out.println("x and y coordinates are on the origin");
        }
        sc.close();
    }
}
