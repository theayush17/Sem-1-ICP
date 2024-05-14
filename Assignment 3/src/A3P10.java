import java.util.*;
public class A3P10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks obtained by the student : ");
        double m=sc.nextDouble();
        int button = 0;
        String s="";
        if (m>=90){
            button=1;
        }
        else if (m>=80 && m<90){
            button=2;
        }
        else if (m>=70 && m<80){
            button=3;
        }
        else if (m>=60 && m<70){
            button=4;
        }
        else if (m>=50 && m<60){
            button=5;
        }
        else if (m>=40 && m<50){
            button=6;
        }
        else if (m<40){
            button=7;
        }
        switch(button){
            case 1:
                s="O";
                break;
            case 2:
                s="A";
                break;
            case 3:
                s="B";
                break;
            case 4:
                s="C";
                break;
            case 5:
                s="D";
                break;
            case 6:
                s="E";
                break;
            case 7:
                s="F";
                break;
            default:
                break;
        }
        System.out.println("Marks secured by the student : "+m+" and the Grade he got : \""+s+"\"");
        sc.close();
    }
}
