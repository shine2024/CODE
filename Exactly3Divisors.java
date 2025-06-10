public class Exactly3Divisors {

    // Method to count numbers with exactly 3 divisors
    public static int exactly3Divisors(int N) {
        int count = 0;

        for (int i = 2; i < N; i++) {
            boolean t = true;

            // Check if i is prime
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    t = false;
                    break;
                }
            }

            if (i * i <= N && t == true) {
                count++;
            }

            if (i * i > N) {
                break;
            }
        }

        return count;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int N = 67;  // You can change this to test other values
        int result = exactly3Divisors(N);
        System.out.println("Numbers with exactly 3 divisors up to " + N + ": " + result);
    }
}
