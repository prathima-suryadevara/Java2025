class Animal {
    void sound1(){
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal {  
    void sound(){
        System.out.println("Dog barks");
    }
}
public class InheritanceExample {
        public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound1();
        dog.sound();
    }
}