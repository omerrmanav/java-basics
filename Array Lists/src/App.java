import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Sorting array
        System.out.println("Sort of Array");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(13);
        numbers.add(7);
        numbers.add(21);
        numbers.add(3);
        Collections.sort(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("\n\n");

        // Sorting array by getting array length and array elements from user
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Length of Array : ");
        int n = input.nextInt();
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            int temp = i;
            temp = input.nextInt();
            numbers2.add(temp);
        }
        System.out.println("\n-----Array-----");
        for (int j : numbers2) {
            System.out.print(j + " ");
        }
        System.out.println("\n-----Sorted Array-----");
        Collections.sort(numbers2);
        for (int k : numbers2) {
            System.out.print(k + " ");
        }
        input.close();
    }
}
