import java.util.Scanner;
public class LinearSearch
{
    public static void main(String[] args){
        System.out.print("Enter the size of an array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" elements of the array : ");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
      //  System.out.println("array : {"+arr[n]+"}");
        System.out.print("Enter the element to search in the array : ");
        int x=sc.nextInt();
        System.out.println("Searching the element "+x+" in the array.......");
        int result = linearsearch(arr,x);
        System.out.println("The element "+x+" is found at index "+result+" in the array");

        sc.close();
    }
    public static int linearsearch(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    
    }
}
