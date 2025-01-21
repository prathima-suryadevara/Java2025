import java.util.Scanner;
public class ReverseLetterTrianglePattern{
public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int x=1;
       // char c='A';
        for(int i=0;i<n;i++)
        {
            for(char c='A';c<='A'+n-i-1;c++){
            System.out.print(c+" ");
            //c++;
           }  
           System.out.println(); 
        }
    sc.close();
}
}
