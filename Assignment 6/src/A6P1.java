import java.util.*;
public class A6P1 {
    static void additionSimple(int x, int y){
        int add=x+y;
        System.out.println("Addition of "+x+" - "+y+" = "+add);
    }
    static void subtractionSimple(int x, int y){
        int sub=x-y;
        System.out.println("Subtraction of "+x+" - "+y+" = "+sub);
    }
    static void multiplicationSimple(int x, int y){
        int mult=x*y;
        System.out.println("Multiplication of "+x+" x "+y+" = "+mult);
    }
    static void divisionSimple(int x, int y){
        int div=x/y;
        System.out.println("Division of "+x+" / "+y+" = "+div);
    }
    static void remainderSimple(int x, int y){
        int remain=x%y;
        System.out.println("Remainder of "+x+" % "+y+" = "+remain);
    }
    static void squareRootSimple(int x){
        int sqr=(int)(Math.sqrt(x));
        System.out.println("Square Root of "+x+" = "+sqr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number for add/subt/mult/div/remainder/sqrt :");
        int x=sc.nextInt();
        System.out.println("Enter the first number for add/subt/mult/div/remainder :");
        int y=sc.nextInt();
        additionSimple(x,y);
        subtractionSimple(x,y);
        multiplicationSimple(x,y);
        divisionSimple(x,y);
        remainderSimple(x,y);
        squareRootSimple(x);
        sc.close();
    }    
}
