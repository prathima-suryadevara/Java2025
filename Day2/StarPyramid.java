package Day2;
import java.util.Scanner;
public class StarPyramid {
public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for (int i=1;i<=n;i++){
        for (int j=i;j<n;j++){
            System.out.print(" ");  
        }
        for (int k=1;k<=(2*i-1);k++) {
        System.out.print("*"); 
        }
        System.out.println();
        sc.close();
}
}
}
