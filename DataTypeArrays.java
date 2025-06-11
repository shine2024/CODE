public class DataTypeArrays {

    // Custom class for demonstration
    static class MyClass {
        int id = 1;
        String name = "Example";

        @Override
        public String toString() {
            return "MyClass{id=" + id + ", name='" + name + "'}";
        }
    }

    public static void main(String[] args) {

        // ✅ Primitive Data Type Arrays
        int[] numbers = {1, 2, 3, 4};
        double[] prices = {1.99, 2.99};
        float[] temps = {98.6f, 99.5f};
        char[] letters = {'A', 'B', 'C'};
        boolean[] flags = {true, false};
        byte[] data = {1, 2, 3};
        short[] ages = {10, 20};
        long[] bigNumbers = {100000L, 200000L};

        // ✅ Reference Data Type Arrays (Wrapper & Object)
        String[] cars = {"Volvo", "BMW"};
        Boolean[] flagsBoxed = {true, false};
        Integer[] numsBoxed = {1, 2, 3};
        Double[] pricesBoxed = {1.99, 2.99};
        Character[] charsBoxed = {'A', 'B'};
        Float[] tempsBoxed = {98.6f, 99.1f};
        Byte[] bBoxed = {1, 2};
        Short[] sBoxed = {10, 20};
        Long[] lBoxed = {1000L, 2000L};
        Object[] mix = {"Text", 123, true};
        MyClass[] objects = {new MyClass(), new MyClass()};

        // ✅ Print Examples
        System.out.println("Primitive int: " + numbers[0]);
        System.out.println("Primitive double: " + prices[0]);
        System.out.println("Primitive float: " + temps[0]);
        System.out.println("Primitive char: " + letters[0]);
        System.out.println("Primitive boolean: " + flags[0]);
        System.out.println("Primitive byte: " + data[0]);
        System.out.println("Primitive short: " + ages[0]);
        System.out.println("Primitive long: " + bigNumbers[0]);

        System.out.println("String: " + cars[0]);
        System.out.println("Boxed Boolean: " + flagsBoxed[0]);
        System.out.println("Boxed Integer: " + numsBoxed[0]);
        System.out.println("Boxed Double: " + pricesBoxed[0]);
        System.out.println("Boxed Character: " + charsBoxed[0]);
        System.out.println("Boxed Float: " + tempsBoxed[0]);
        System.out.println("Boxed Byte: " + bBoxed[0]);
        System.out.println("Boxed Short: " + sBoxed[0]);
        System.out.println("Boxed Long: " + lBoxed[0]);
        System.out.println("Mixed Object: " + mix[0] + ", " + mix[1] + ", " + mix[2]);
        System.out.println("Custom Class Object: " + objects[0]);
    }
}
