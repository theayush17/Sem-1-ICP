public class occurence {
    public static void main(String[] args) {
        // int a[]={2,2,4,2,4,1};
        // int i,j;
        // for( i=0;i<a.length;i++){
        //     int count =0;
            
        //     for ( j=i+1;j<a.length;j++){
        //         if (a[j]==a[i]){
        //             count++;
        //         }
        //         else{
        //             break;
        //         }
                
        //     }
        //     i=j-1;
        //     if (count>1)
        //         System.out.println(a[i]+" is present "+count+" time");
            
            

            
            
        // }
        int a=0;
        int b=1;
        for (int i=1;i<=10;i++){
            System.out.print(a+" ");
            a=a+b;
            b=a-b;
        }
    }
    
}
