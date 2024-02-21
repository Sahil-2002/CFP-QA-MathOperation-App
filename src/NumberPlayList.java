import java.util.List;
import java.util.function.Consumer;

public class NumberPlayList {
    public static void main(String[] args) {


        int[] arr = {10, 15, 20, 60, 78, 65, 23, 46, 50, 66};
        Consumer<Integer> con = n -> {
            System.out.println(n);
        };
        for (int n : arr) {
            con.accept(n);

        }
    }
}