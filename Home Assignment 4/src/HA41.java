public class HA41 {
    public static void main(String[] args) {
        int square_sum=1;
        int sum_square=0;
        int sum=0;
        for (int i=1;i<=10;i++){
            sum_square=sum_square+((int)Math.pow((i),2));
            sum=sum+i;
        }
        square_sum=(int)Math.pow(sum,2);
        System.out.println("Sum of sqaure is "+sum_square);
        System.out.println("Square of the sum is "+square_sum);
    }    
}
