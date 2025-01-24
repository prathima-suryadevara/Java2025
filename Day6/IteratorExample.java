import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            //if (name.contains("a")) {
            //    iterator.remove();
          //  }
            System.out.println(name);
        }
    }
}
