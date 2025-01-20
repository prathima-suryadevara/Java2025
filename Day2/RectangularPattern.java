package Day2;
import java.util.Scanner;
public class RectangularPattern {
 public static void main(String[] args) {
    System.out.println("Please enter a number :");
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            } 
            System.out.println();       
        }
    sc.close();
 }
}
