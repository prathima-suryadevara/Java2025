import java.util.ArrayList;

class Student {}
class Rockstar {}
class Hacker {}

public class InstanceOF{
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<Object>();
        objects.add(new Student());
        objects.add(new Rockstar());
        objects.add(new Hacker());
        objects.add(new Student());
        objects.add(new Hacker());
        objects.add(new Rockstar());
        count(objects);
    }

    public static void count(ArrayList<Object> objects) {
        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;
        
        for (Object obj : objects) {
            if (obj instanceof Student) {
                studentCount++;
            } else if (obj instanceof Rockstar) {
                rockstarCount++;
            } else if (obj instanceof Hacker) {
                hackerCount++;
            }
        }
        System.out.println(studentCount);
        System.out.println(rockstarCount);
        System.out.println(hackerCount);
    }
}