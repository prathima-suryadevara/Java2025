import java.util.Scanner;
public class PrimeFactors {
    public static void printPrimeFactors(int num) {
        System.out.print("Prime factors of " + num + " are: ");
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }
        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
        if (num > 2) {
            System.out.print(num);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        printPrimeFactors(number);
        scanner.close();
    }
}
