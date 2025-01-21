import java.util.Scanner;

public class AlphaTrianglePattern {
public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     /*   int x=0;
        //char c='E';
        char c=(char)('A'+(n-1)-x);
        for (int i=0;i<=n;i++) {
            if(x>n){
                x++;
             }
             System.out.print((char)(c+i)+" ");

        }
        System.out.println();
        

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++){
            System.out.print(c+" "); 
            c--;  
           }  
           System.out.println(); 
        }*/
        for (int i=0;i<n;i++) {
            for (char c=(char)('A'+n-1-i); c<='A'+n-1; c++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    sc.close();
}
}
