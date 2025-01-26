public class FibonacciFromAnyTwoNumbers {
    public static void main(String[] args) {
        int firstNumber = 3;
        int secondNumber = 5; 
        int terms = 10; 
        System.out.print("Fibonacci sequence starting with " + firstNumber + " and " + secondNumber + ": ");
        System.out.print(firstNumber + " " + secondNumber + " ");
        int nextNumber;
        for (int i = 3; i <= terms; i++) {
            nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
