import  java.util.*;
public  class sieve{


    public static ArrayList<Integer> getprimes(int num){
        boolean[] n =new boolean[num+1];
        Arrays.fill(n, true);
        n[0]=false;
        n[1]=false;

        for(int i=2;i<=num/2;i++){
         if(n[i]){
            for (int j=i*i;j<=num;j=j+i){
               n[j]=false;
            }

         }

        }

        ArrayList<Integer> result=new ArrayList<>();
        for(int i=2;i<=num;i++){
            if(n[i]== true){
                result.add(i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(getprimes(100));
         System.out.println(getprimes(2));
    }
}