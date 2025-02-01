import java.util.Scanner;
import java.util.Arrays;
public class SplitSortedArray {
    public static int[][] splitArray(int[] arr) {
        int mid = arr.length / 2;
        int[] firstHalf = Arrays.copyOfRange(arr, 0, mid);  
        int[] secondHalf = Arrays.copyOfRange(arr, mid, arr.length);  
        return new int[][] { firstHalf, secondHalf };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[][] splitArrays = splitArray(arr);
        System.out.println("First half of the array:");
        System.out.println(Arrays.toString(splitArrays[0]));
        System.out.println("Second half of the array:");
        System.out.println(Arrays.toString(splitArrays[1]));

        scanner.close();
    }
}
