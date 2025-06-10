

import java.util.Arrays;

public class Maximum_index{
    public static void MI(int arr[]){
    int[] max=new int[arr.length];
    int len=arr.length-1;
    int mx=arr[len];
    
    for(int i=len;i<=arr.length;i--){
    if (arr[i]>=mx) {
          max[i]=arr[i];
          mx=arr[i];
    }else{
       max[i] = mx;
    }
    }

   System.err.println(Arrays.toString(arr));
System.err.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int n[]= new int[]{1,2,3,4,5,6,7,8,9};
        MI(n);
    }
}



