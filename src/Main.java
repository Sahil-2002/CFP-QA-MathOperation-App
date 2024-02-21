import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
interface Mathfunction {
    public int calculate(int a, int b);

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Math operation App");
        System.out.println(" ");
        Mathfunction add = (a, b) -> a + b;
        System.out.println("Addition is :"+add.calculate(20, 30));
        Mathfunction sub = (a, b) -> a - b;
        System.out.println("Subtraction is "+sub.calculate(20, 30));
        Mathfunction div = (a, b) -> a / b;
        System.out.println("Division is "+div.calculate(20, 30));
        Mathfunction mul =(a,b)-> a*b;
        System.out.println("Multiplication is "+mul.calculate(20,30));


    }
}