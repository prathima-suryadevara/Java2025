import java.util.Scanner;
public class AreaOfObjects {
    public static void main(String[] args) {
        System.out.println("Enter the option to calculate area of object: 1.Circle 2.Triangle 3.Square 4.rectangle");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        double Area=0;
        switch(option){
            case 1:System.out.println("Enter radius of circle :");
            double r = sc.nextDouble();
            Area=3.14*r*r;
            System.out.println("Area of circle is "+Area);
            break;
            case 2:System.out.println("Enter base of triangle :");
            double b =sc.nextDouble();
            System.out.println("Enter height of triangle :");
            double h =sc.nextDouble();
            Area=0.5*b*h;
            System.out.println("Area of Triangle is "+Area);
            break;
            case 3:System.out.println("Enter side of square :");
            double s =sc.nextDouble();
            Area=s*s;
            System.out.println("Area of square is "+Area);
            break;
            case 4 :System.out.println("Enter length of rectangle :");
            double l =sc.nextDouble();
            System.out.println("Enter width of rectangle :");
            double w =sc.nextDouble();
            Area=l*w;
            System.out.println("Area of rectangle is "+Area);
            break;
            default: System.out.println("Please enter a valid option");
        }
       sc.close();
    }

}
