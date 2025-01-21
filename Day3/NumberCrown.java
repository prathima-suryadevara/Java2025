import java.util.Scanner;
public class NumberCrown {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=2*(n-1);
        for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
         System.out.print(j);
         }
         for(int j=1;j<=x;j++){
         System.out.print(" ");
         }
         for(int j=i;j>=1;j--){
          System.out.print(j);
         }
        System.out.println();
        x=x-2;
     }
        sc.close();
    }
}
