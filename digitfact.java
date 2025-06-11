class digitfact {
    public static  int digitsInFactorial(int N) {
        // code here
        int digit=0;
        long n=fact(N);
        System.out.println("n"+n);
        while(n>0){
            n/=10;
            digit++;
        }
        return digit;
        
    }
    public static long fact(int N){
        long fac=1;
        for(int i=2;i<=N;i++){
            fac *=i;
        }
        return fac;
    }

    public static void main(String arg[]){
        System.out.print(digitsInFactorial(120));
        
    }
}
