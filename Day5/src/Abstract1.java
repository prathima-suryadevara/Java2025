import java.util.Scanner;;
abstract class Book{
    abstract void setBooktitle(String s);
 }
 class MyBook extends Book{
    // @Override
     void setBooktitle(String s){
         System.out.println("The title is: " + s);
     }
 }
 
 public class Abstract1 {
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         MyBook book = new MyBook();
         book.setBooktitle(str);
     sc.close();
 }
 } 