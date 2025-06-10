public  class  MinsumOfSubarray{
     public static int sum(int[] arr){

       int len=arr.length;
       int maxSum=arr[0];
       int overallsum =arr[0];

       for(int i=1;i<len;i++){
        if(maxSum >0){
           maxSum =arr[i];
        }else{
            maxSum +=arr[i];
        }
     
     if(maxSum<overallsum){
        overallsum=maxSum;
     }
        
       }
    return  overallsum;
     }
    public static void main(String[] args) {
        System.out.println(sum(new  int[]{-10, 2, 3, -2, 5}));
         System.out.println(sum(new  int[]{-1,-2,-3,-4}));
          System.out.println(sum(new  int[]{1,2,3,4}));
    }
}