import java.util.Scanner;
import java.util.Arrays;
public class SortAnArray {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array : ");
    int n=sc.nextInt();
    System.out.println("Enter "+n+ " elements of the array : ");
    int[] ar=new int[n];
    for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
    }
    Arrays.sort(ar);
    System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    sc.close();
 }
}
