import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix : ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns in matrix : ");
        int columns=sc.nextInt();
        int[][] matrix1=new int[rows][columns];
        int[][] matrix2=new int[rows][columns];
        int[][] result=new int[rows][columns];
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
