import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sort of Array");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(13);
        numbers.add(7);
        numbers.add(21);
        numbers.add(3);
        Collections.sort(numbers);
        for(int i : numbers){
            System.out.print(i + " ");
        }
    }
}
