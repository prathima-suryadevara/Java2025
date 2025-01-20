import java.util.Scanner;
public class MathOperations {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter second number: ");
        int n2=sc.nextInt();
        int result=0;
        System.out.println("select the option : 1.Add 2.Sub 3.Mult");
        int option=sc.nextInt();
        switch(option){
            case 1:result=n1+n2;
            System.out.println("Addition of "+n1+" and "+n2+" is "+result);
            break;
            case 2:result=n1-n2;
            System.out.println("Substraction of "+n1+" and "+n2+" is "+result);
            break;
            case 3:result=n1*n2;
            System.out.println("Multiplication of "+n1+" and "+n2+" is "+result);
            break;
            default:
            System.out.println("Please choose a valid option.");   
        }
        sc.close();
        }
}
