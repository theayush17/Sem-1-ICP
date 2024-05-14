public class A1P8 {
    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println("Before swapping :x = "+x+", y = "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping : x = "+x+", y = "+y);
    }
}
