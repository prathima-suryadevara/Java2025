import java.util.Scanner;

public class InsertElementInArray {
public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the element to be inserted in the Array : ");
    int e=scanner.nextInt();
    System.out.print("Enter the size of array : ");
    int size=scanner.nextInt();
    System.out.print("Enter "+size+ " elements of the array : ");
    int[] array=new int[size];
    for (int i = 0; i < size; i++) {
        array[i] = scanner.nextInt();
    }
    System.out.print("Enter the position to insert the element from 0 to " + size + " : ");
    int position = scanner.nextInt();
    if (position < 0 || position > size) {
        System.out.println("Invalid position");
    } else {
        int[] newArray = new int[size + 1];
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        newArray[position] = e;
        for (int i = position; i < size; i++) {
            newArray[i + 1] = array[i];
        }
        System.out.println("Array after insertion:");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    scanner.close();
}
}
}
