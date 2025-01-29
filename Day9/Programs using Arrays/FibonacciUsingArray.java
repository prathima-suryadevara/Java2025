/*import java.util.Scanner;
public static void main(String args[]){
    System.out.println("Enter a number:");
    Scanner scanner=new Scanner(System.in);
    int x= scanner.nextInt();
    int[] t= fb(x);
    System.out.print("Fibonacci sequence: ");
        for (int i=0;i<t; i++) {
            System.out.print(t[i] + " ");
        }
    scanner.close();
}
public class FibonacciUsingArray {
    public static int[] fb(int n){
        int[] t=new int[n];
        if (n > 0) t[0] = 0;
        if (n > 1) t[1] = 1;
        for (int i = 2; i < n; i++) {
            t[i] = t[i-1] + t[i-2];
        }
        return t;
    }
}
*/

import java.util.Scanner;
public class FibonacciUsingArray {
public static int[] fibonacciSeries(int n) {
        int[] fibonacci = new int[n];
        if (n > 0) fibonacci[0] = 0;
        if (n > 1) fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci sequence: ");
        int terms = scanner.nextInt();
        int[] fibonacci = fibonacciSeries(terms);
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        scanner.close();
    }
}

