import java.util.Scanner;
import java.util.HashSet;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        HashSet<Integer> uniqueElements = new HashSet<>();
                for (int i = 0; i < n; i++) {
            uniqueElements.add(array[i]);
        }
        Integer[] resultArray = uniqueElements.toArray(new Integer[0]);
        System.out.println("Array after removing duplicates:");
        for (Integer element : resultArray) {
            System.out.print(element + " ");
        }
        scanner.close();
    }
}
