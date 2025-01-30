import java.util.Scanner;
public class ReverseTheArrayElements {
public static void main (String args[]){
    System.out.print("Enter the no.of elements in the array :");
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    System.out.println("Enter the "+n+" elements in the array :");
    int[] array=new int[n];
    for (int i = 0; i < n; i++) {
        array[i] = scanner.nextInt();
    }
    ReverseArray(array);
    System.out.println("Reversed array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
scanner.close();

}
   public static void ReverseArray(int[] arr){
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
    }
