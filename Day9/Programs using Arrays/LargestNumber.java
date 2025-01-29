import java.util.Scanner;
public class LargestNumber {
    public static int findLargest(int[] lgst) {
        int largest = lgst[0];
        for (int i = 1; i < lgst.length; i++) {
            if (lgst[i] > largest) {
                largest = lgst[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] lgst = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            lgst[i] = scanner.nextInt();
        }
        int largest = findLargest(lgst);
        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}
