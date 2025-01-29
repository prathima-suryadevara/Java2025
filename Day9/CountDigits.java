import java.util.Scanner;
public class CountDigits {
    public static int countDigits(int num) {
        num = Math.abs(num);
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            num /= 10; 
            count++;   
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);
        System.out.println("The number of digits in " + number + " is: " + digitCount);
        scanner.close();
    }
}
