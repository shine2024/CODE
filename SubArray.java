// public class  SubArray{

//     public static void main(String[] args) {
//         int[] n={-10,2,3,8,4,-10};
//         int len=n.length;
//         for(int start=0;start<len;start++){
//             for(int end=start;end<len;end++){
//                 for(int k=start;k<=end;k++){
//                     System.out.print(n[k]+" ");
//                 }System.out.print("    ");
//             }System.out.println();
//         }
//     }
// }

// (TC-n^3)


// public class  SubArray{

//     public static void main(String[] args) {
//          int st=0,en=0,max=0;
//         int[] n={3,-4,5,4,-1,7,-8};
//         int len=n.length;
//         for(int start=0;start<len;start++){
//             for(int end=start;end<len;end++){
//                 int s=0;
//                 for(int k=start;k<=end;k++){
//                     s+=n[k];
//                     System.out.print(n[k]+" ");
//                 }System.out.print("    "+"st"+start+"en"+end+" "+s);
//                 if(s>max){
//                     max=s;
//                     st=start;
//                     en=end;
//                 }
//             }System.out.println();
//         }

//         System.out.println("start"+st+" end"+en+" max"+max);
//     }
// }



// (TC-n^2)
// public class  SubArray{

//     public static void main(String[] args) {
//          int st=0,en=0,max=0;
//         int[] n={3,-4,5,4,-1,7,-8};
//         int len=n.length;
//         for(int start=0;start<len;start++){int s=0;
//             for(int end=start;end<len;end++){
                
//                 s+=n[end];
//                  if(s>max){
//                 max=s;
//             }
//             }System.out.println();
           
//         }

//         System.out.println("start"+st+" end"+en+" max"+max);
//     }
// }




//(TC-n)


public  class  SubArray{
     public static int sum(int[] arr){

       int len=arr.length;
       int maxSum=arr[0];
       int overallsum =arr[0];

       for(int i=1;i<len;i++){
        if(maxSum <0){
           maxSum =arr[i];
        }else{
            maxSum +=arr[i];
        }
     
     if(maxSum>overallsum){
        overallsum=maxSum;
     }else{
        overallsum=overallsum;
     }
        
       }
    return  overallsum;
     }
    public static void main(String[] args) {
        System.out.println(sum(new  int[]{-10, 2, 3, -2, 5}));
         System.out.println(sum(new  int[]{-1,-2,-3,-4}));
    }
}