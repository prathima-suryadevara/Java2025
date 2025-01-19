import java.util.Scanner;

public class AvgOfArray {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        System.out.println("Enter " + n + " elements:");
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble(); 
            sum += arr[i];
        }
        double avg = sum / n;
        System.out.println("The average of the array is: " + avg);
        sc.close();
    }
}
