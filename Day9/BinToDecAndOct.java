import java.util.Scanner;
public class BinToDecAndOct {
    public static int binToDec(String binary) {
        return Integer.parseInt(binary, 2); 
    }
    public static String binToOct(String binary) {
        int decimal = binToDec(binary); 
        return Integer.toOctalString(decimal); 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimal = binToDec(binary);
        String octal = binToOct(binary);
        System.out.println("Decimal equivalent: " + decimal);
        System.out.println("Octal equivalent: " + octal);
        scanner.close();
    }
}

