import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        int[] arr ={10, 15, 20, 60, 78, 65, 23, 46, 50, 66};

        Predicate<Integer> pr = n->n%2==0;
        for(int num : arr){
            if(pr.test(num)){
                System.out.println(num);
            }
        }
    }
}
