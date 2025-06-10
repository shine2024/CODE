public  class  CountNumbers{


public static int countDigits(int n) {
    int result=0;
        for (int j = 1; j-1 < n; j*=10) {
        result += (n - (j - 1));
    }

        return result;
    }
public static void main(String[] args) {
    System.out.println(countDigits(25));
        System.out.println(countDigits(41));
        System.out.println(countDigits(1000));
}
}