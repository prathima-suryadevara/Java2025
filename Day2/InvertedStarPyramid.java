package Day2;
import java.util.Scanner;
public class InvertedStarPyramid {
public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    for (int i=n;i>=1;i--){
        for (int j=n;j>i;j--){
            System.out.print(" ");  
        }
        for (int k=1;k<=2*i-1;k++) {
            System.out.print("*"); 
            }
        System.out.println();
        sc.close();
}
}
}
