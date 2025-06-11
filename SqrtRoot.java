import java.lang.*;
import java.util.ArrayList;

public class SqrtRoot {
     public  static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> roots = new ArrayList<>();
        int D = b * b - 4 * a * c;

        if (D < 0) {
            roots.add(-1);
            roots.add(-1);
        } else {
            double sqrtD = Math.sqrt(D);
            double root1 = (-b + sqrtD) / (2.0 * a);
            double root2 = (-b - sqrtD) / (2.0 * a);

            int r1 = (int)Math.floor(Math.max(root1, root2));
            int r2 = (int)Math.floor(Math.min(root1, root2));

            roots.add(r1);
            roots.add(r2);
        }
        return roots;
    }
    public static void main(String[] args) {
        System.out.println(quadraticRoots(752,904,164));
    }
    
}
