package Day2;
import java.util.Scanner;
public class RightAngledNumberPyramid {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
