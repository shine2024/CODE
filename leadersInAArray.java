
import java.util.*;
// public class leadersInAArray{

//     public static ArrayList<Integer> leader(int[] a){
//         int i;
//         ArrayList<Integer> res=new ArrayList<>();
//        // int num[];
//      for( i=0;i<a.length;i++){
//        // System.err.println(a[i]);
//                  boolean isLeader = true;
//             for (int j = i + 1; j < a.length; j++) {
//                // System.out.println(i+"i" +a[i]+"   "+j+"j"+a[j]);
//                 if (a[i] < a[j]) {
//                     isLeader = false;
//                     break;
//                 }
//             }
//             if (isLeader) {
//                res.add(a[i]);
//                // System.out.print(a[i] + " ");
//             }
//      }  return  res;
//     }
//     public static void main(String[] args) {
//       System.out.println(leader(new int[]{1,2,3,2,18}));  
//       System.out.println(leader(new int[]{16,17,4,3,5,2}));  
//     }
// }





// import java.util.ArrayList;
// import java.util.Arrays;

// public class LeadersInAArray {

//     public static int[] leader(int[] a) {
//         ArrayList<Integer> result = new ArrayList<>();

//         for (int i = 0; i < a.length; i++) {
//             boolean isLeader = true;

//             for (int j = i + 1; j < a.length; j++) {
//                  System.out.println(i+"i" +a[i]+"   "+j+"j"+a[j]);
//                 if (a[i] < a[j]) {
//                     isLeader = false;
//                     break;
//                 }
//             }

//             if (isLeader) {
//                 result.add(a[i]);
//             }
//         }

//         // Convert ArrayList to array
//         int[] leaders = new int[result.size()];
//         for (int i = 0; i < result.size(); i++) {
//             leaders[i] = result.get(i);
//         }

//         return leaders;
//     }

//     public static void main(String[] args) {
//         System.out.println(Arrays.toString(leader(new int[]{1, 2, 3, 2, 18})));  
//         System.out.println(Arrays.toString(leader(new int[]{16, 17, 4, 3, 5, 2})));  
//     }
// }




public class leadersInAArray {
    static ArrayList<Integer> leader(int arr[]) {
        // code here
        int max=arr[arr.length-1];//2,3
        ArrayList<Integer> n=new ArrayList<>();
        //4,3,2,1
        n.add(max);//1
        for(int i=arr.length-2;i>=0;i--){//2,3
         // System.err.println("max"+max);
          //System.out.println(i+"i" +arr[i]+"   "+"j"+arr[i-1]);
             if (arr[i] >= max) {//2>1,3>2
                max = arr[i];//2,3
                n.add(max);//2,3
            }
        }
       Collections.reverse(n);
        return n;
    }

    public static void main(String[] args) {
         System.out.println((leader(new int[]{9,8,7,6})));
             System.out.println((leader(new int[]{61,61,17})));
        System.out.println((leader(new int[]{1, 2, 3, 2, 18})));  
        System.out.println((leader(new int[]{16, 17, 4, 3, 5})));  
    }
}
