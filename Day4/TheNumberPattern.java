import java.util.Scanner;
public class TheNumberPattern
 {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = n - Math.min(Math.min(i, j), Math.min(size - i - 1, size - j - 1));
                System.out.print(value + " ");
            }
            System.out.println(); 
        }
     /*  // int k=0;
        for(int i=1;i<=n*2-1;i++){
          //  System.out.print(n-k+" ");
          System.out.print((2*n-2)-i+" ");

        //}
        for(int j=0;j<=n*2-1;j++){
            System.out.print((2*n-2)-j+" ");
        }
        System.out.println();

    /*     for(int i=1;i<n*2-1;i++){
            System.out.print(n+" ");
        }
        for(int i=0;i<n*2-1;i++){
            System.out.println(n+" ");
        }
    
        for(int i=2;i<n*2-1;i++){
            System.out.print(n-1+" ");
        }
        for(int i=1;i<n*2-1;i++){
            System.out.println(n-1+" ");
        }
    */
        sc.close();

    }
}
