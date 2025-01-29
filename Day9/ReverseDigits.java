import java.util.Scanner;

public class ReverseDigits {
    public static int reverseDigits(int num) {
        int reversed = 0;
        boolean isNegative = num < 0;
        if (isNegative) {
            num = -num; 
        }
        while (num != 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit; 
            num /= 10;
        }
        return isNegative ? -reversed : reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }
}

