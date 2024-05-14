public class pattern3 {
    public static void main(String[] args) {
        for (int i= 1; i<= 4 ; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=4-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i=3; i>= 1 ; i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=4-i; k>=0; k--)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}                                                       
