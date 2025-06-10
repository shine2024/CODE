public class SmallestPostiveNum{



public static int numpositiv(int[] n){
     for (int i=0;i<n.length;i++){
        if(n[i]<=0){
           n[i] =n.length+1;
        }
    }

    for (int i=0;i<n.length;i++){
        if(n[i]>0 && n[i]<n.length+1){
            if( n[n[i]-1] >0){
         n[n[i]-1]*=-1;}
        }
    }

     for (int i=0;i<n.length;i++){
        if(n[i]>0){
       return  i+1;
        }
    }
    return n.length+1;
}

    public static void main(String[] args) {
        System.out.println(numpositiv(new int[]{-1, 0, 2, 1, 3}));
        System.out.println(numpositiv(new int[]{0, -10, 1, 2, 2, -20}));
        System.out.println(numpositiv(new int[]{0, -10, 1, 3, -20}));
        System.out.println(numpositiv(new int[]{1, 2, 3, 4, 5}));
    }
}



// brute force 

// public class SmallestPositiveNum{

//     public static int firstMissingPositive(int[] arr) {
//         int n = arr.length;
        
//         // Check each positive integer starting from 1
//         for (int i = 1; i <= n + 1; i++) {
//             boolean found = false;

//             // Check if 'i' is present in the array
//             for (int j = 0; j < n; j++) {
//                 if (arr[j] == i) {
//                     found = true;
//                     break;
//                 }
//             }

//             // If not found, this is the first missing positive
//             if (!found) {
//                 return i;
//             }
//         }

//         return n + 1; // fallback (won't be reached)
//     }

//     public static void main(String[] args) {
//         System.out.println(firstMissingPositive(new int[]{1, 2, 3, 4, 5})); // Output: 6
//         System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));   // Output: 2
//         System.out.println(firstMissingPositive(new int[]{7, 8, 9, 11}));   // Output: 1
//     }
// }

// with sets
// import java.util.*;

// public class FirstMissingPositiveSet {
//     public static int firstMissingPositive(int[] nums) {
//         Set<Integer> set = new HashSet<>();

//         // Add only positive numbers to the set
//         for (int num : nums) {
//             if (num > 0) {
//                 set.add(num);
//             }
//         }

//         // Start from 1 and check which number is missing
//         int smallest = 1;
//         while (true) {
//             if (!set.contains(smallest)) {
//                 return smallest;
//             }
//             smallest++;
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println(firstMissingPositive(new int[]{-1, 0, 2, 1, 3})); // Output: 4
//         System.out.println(firstMissingPositive(new int[]{1, 2, 3, 4, 5}));  // Output: 6
//         System.out.println(firstMissingPositive(new int[]{0, -10, 1, 3, -20})); // Output: 2
//     }
// }
