//import java.lang.reflect.Array;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("Enter a string to reverse : ");
        Scanner sc=new Scanner(System.in);
            String s=sc.next();
            int n=s.length();
            String a="";
            System.out.println("Reverse of given string is ");
            for(int i=n-1;i>=0;i--){
                 a=a+s.charAt(i);   
            }
           System.out.print(a);   
         sc.close();
    }
  

}
