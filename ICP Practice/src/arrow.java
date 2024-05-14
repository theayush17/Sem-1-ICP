public class arrow {
    public static void main(String[] args) {
        for (int i=5;i!=0;i--){
            for (int j=32-i;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=33-i;k>=i;k--)
                System.out.println("*");
        }
        System.out.println();
    }
 }

                    //     *
//                          *
//                           *
//                            * 
// *****************************
//                            *
//                           *
//                          *
//                         *
                 