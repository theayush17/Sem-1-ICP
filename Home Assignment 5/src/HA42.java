public class HA42 {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Multiples of 3 and 5 are :");
        for (int i=1;i<=1000;i++){
            
            if ((i%3==0 && i%5==0) || (i%3==0 || i%5==0)){
                sum=sum+i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Sum of these multiples are : "+sum);
    }
}
