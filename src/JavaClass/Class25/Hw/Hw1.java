package JavaClass.Class25.Hw;

import java.util.ArrayList;
import java.util.Iterator;

//values using 3 different ways.
//Create an arrayList of words. Remove every word that ends with “e”.
public class Hw1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kenny");
        names.add("Linda");
        names.add("Ethan");
        names.add("Malia");
        names.add("Goldie");
        names.removeIf(x -> x.endsWith("e"));
        System.out.println(names);
    }
}
class Hw1b {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kenny");
        names.add("Linda");
        names.add("Ethan");
        names.add("Malia");
        names.add("Goldie");
        Iterator<String> iterators = names.iterator();
        while (iterators.hasNext()) {
            String item = iterators.next();
            if (item.endsWith("e")) {
            } else {
                System.out.print(item+", ");
            }
        }
    }
}

class Hw1c {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kenny");
        names.add("Linda");
        names.add("Ethan");
        names.add("Malia");
        names.add("Goldie");
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).contains("e")) {
            } else {
                System.out.print(names.get(i)+", ");
            }
        }
    }
}