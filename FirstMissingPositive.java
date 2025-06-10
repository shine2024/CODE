
public class FirstMissingPositive {

    // Time Complexity: O(n)
    // Auxiliary Space: O(1)
    public static int firstPositiveMissing(int[] arr) {
        int n = arr.length;

        
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                arr[i] = n + 2;
            }
        }

      
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num >= 1 && num <= n) {
                int bucketIndex = num - 1;
                if (arr[bucketIndex] > 0) {
                    arr[bucketIndex] *= -1;
                }
            }
        }

        
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        System.out.println(firstPositiveMissing(new int[]{1, 2, 3, 4, 5}));
        System.out.println(firstPositiveMissing(new int[]{0, -10, 1, 3, -20}));
        System.out.println(firstPositiveMissing(new int[]{0, -10, 1, 2, 2, -20}));
    }
}
