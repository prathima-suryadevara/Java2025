class car{
    String color;
    String model;
    void start(){
        System.out.println("The car is starting");
    }
}

public class ClassAndObject {
 public static void main (String[] args){
    car cr=new car();
    cr.color="Black";
    cr.model="Tesla";
    cr.start();
System.out.println("My car colour is "+cr.color);
System.out.println("My car model is "+cr.model);

 }
}
