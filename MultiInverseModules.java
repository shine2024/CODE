public class MultiInverseModules{
    public static void main (String args[]){
        long a=92233720368547758L;
        long b=92233720368547758L;

        int m= 1000000007;
        System.out.println(((a%m)*(b%m))%m);
    }
}