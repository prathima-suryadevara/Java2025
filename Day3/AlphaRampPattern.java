import java.util.Scanner;

public class AlphaRampPattern {
public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int x=1;
        char c='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++){
            System.out.print(c+" ");    
           }  
           c++;  
           System.out.println(); 
        }
    sc.close();
}
}
