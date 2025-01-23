import java.util.Scanner;

interface Calculator {
    int divisorSum(int n);
}
public class Interface implements Calculator {
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { 
                sum += i;
            }
        }
        return sum; 
    }

    public static void main(String[] args) {
        Interface calculator = new Interface();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Divisor sum of " + n + " is: " + calculator.divisorSum(n));
        sc.close();
    }
}
