import java.util.Scanner;

public class SearchElementInArray {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
       // System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
           // System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int element = scanner.nextInt();
        int index = searchElement(arr, element);
        if (index != -1) {
            System.out.println("Element " + element + " found at index: " + index);
        } else {
            System.out.println("Element " + element + " not found in the array");
        }
        scanner.close();
    }
    public static int searchElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; 
    }

}
