import java.util.Scanner;
public class BinaryNumberTrianglePattern {
public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;

        for(int i=0;i<n;i++)
        {
           // if(i%2==1&&j%2==0)  {
           if(i%2==0){
                x=1;
            }  else{
                x=0;
            } 
            for(int j=0;j<=i;j++){
            System.out.print(x); 
            x=1-x;     
           }  
           System.out.println(); 
        }
    sc.close();
}
}
