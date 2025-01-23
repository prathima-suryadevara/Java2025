import java.util.Scanner;

public class Inheritance2 {
public static void main(String[] args){
   Adder a = new Adder();
   
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());  
       // System.out.print(a.add(1,3) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers for performing "+ a.getClass().getSuperclass().getName()+" Operation");
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        System.out.println("Addition of "+x+" & "+y+" is "+a.add(x,y));
        sc.close();
    }
   }
   class Arithmetic {
    public int add(int a,int b){ 
        return a+b;
         } 
   }         
class Adder extends Arithmetic{

}

