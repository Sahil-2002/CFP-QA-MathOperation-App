import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 60, 78, 65, 23, 46, 50, 66};

        Function<Integer, Double> fn = n -> {
            return Double.valueOf(n);
        };

        for (int n : arr) {
            System.out.println(fn.apply(n));
        }
    }
}