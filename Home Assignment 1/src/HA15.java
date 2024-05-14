public class HA15 {
    public static void main(String[] args) {
//      with the third variable
        int w=5, g=10,k=15,a=20,temp;
        temp=w;
        w=g;
        g=k;
        k=a;
        a=temp;
        System.out.println("After exchanging the values: w = "+w+" g = "+g+" k = "+k+" a = "+a);
//      without the third variable
        int W=5,G=10,K=15,A=20;
        W=W+G+K+A;
        A=W-(G+K+A);
        K=W-(G+K+A);
        G=W-(G+K+A);
        W=W-(G+k+A);
        System.out.println("After echangingnthe values : W = "+W+" G = "+G+" K = "+K+" A = "+A);
    }
}
