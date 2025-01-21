import java.util.Scanner;

public class IncreasingNumberTrianglePattern {
public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++){
            System.out.print(x+" "); 
            x++;     
           }  
           System.out.println(); 
        }
    sc.close();
}
}
