/*import java.util.Scanner;
public class DeletingAnElementInArray {
public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int size=scanner.nextInt();
    System.out.print("Enter "+size+ " elements of the array : ");
    int[] array=new int[size];
    for (int y = 0; y < size; y++) {
        array[y] = scanner.nextInt();
    }
    System.out.print("Enter the element to be deleted in the Array : ");
    int e=scanner.nextInt();
    System.out.print("Enter the position to delete the element from 0 to " + size + " : ");
    int position = scanner.nextInt();
    if (position < 0 || position > size) {
        System.out.println("Invalid position");
    } else {
        int indexToDelete = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == e) {
                indexToDelete = i;
                break;
            }
            if (indexToDelete == -1) {
                System.out.println("Element not found in the array.");
            } else {
                for (int z = indexToDelete; z < size - 1; z++) {
                    array[z] = array[z + 1];
                }
                int[] newArray = new int[size - 1];
                for (int m = 0; m < size - 1; m++) {
                    newArray[m] = array[m];
                }
                System.out.println("Array after deletion:");
                for (int q : newArray) {
                    System.out.print(q + " ");
                }   }
    scanner.close();
}
}
}
}
  */
  import java.util.Scanner;

public class DeletingAnElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to delete: ");
        int elementToDelete = scanner.nextInt();
        
        int indexToDelete = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == elementToDelete) {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete == -1) {
            System.out.println("Element not found in the array.");
        } else {
            for (int i = indexToDelete; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            int[] newArray = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                newArray[i] = array[i];
            }
            
            System.out.println("Array after deletion:");
            for (int i : newArray) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
  