import java.util.Scanner;

public class AlphaHillPattern {
   public static void main(String[] args) {
    System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
 
    for(int i=0;i<N;i++){
       for(int j=0;j<N-i-1;j++){
            System.out.print(" ");
        }
        char ch = 'A';
        int breakpoint = (2*i+1)/2;
        for(int j=1;j<=2*i+1;j++){
            
            System.out.print(ch);
            if(j <= breakpoint) ch++;
            else ch--;
        }
        for(int j=0;j<N-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
        
    }
    sc.close();
}
}
