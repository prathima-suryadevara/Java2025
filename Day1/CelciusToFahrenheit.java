import java.util.Scanner;
public class CelciusToFahrenheit {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter temperature in celcius : ");
    int c=sc.nextInt();
    double F=(9.0/5.0)*c+32;
    System.out.println("Temperature in Fahrenheit is "+(F));
    sc.close();
 }
}
