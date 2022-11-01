package JavaClass.Class25.Hw;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw2 {
    public static void main(String[] args) {

////values using 3 different ways.
// Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    ArrayList<String> drinks = new ArrayList<>();
            drinks.add("Boba Tea");
            drinks.add("Pepis");
            drinks.add("Pisco Sour");
            drinks.add("Sprite");
            drinks.add("Old Fashion");
            drinks.add("Coke");

    for (int i = 0; i < drinks.size(); i++) {
        if (drinks.get(i).contains("a") || drinks.get(i).contains("e") || drinks.get(i).contains("A") || drinks.get(i).contains("E")) {
            System.out.print("Water, ");
        } else {
            System.out.print(drinks.get(i)+" ");
        }
    }

    }
}
class Hw2b{
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Boba Tea");
        drinks.add("Pepis");
        drinks.add("Pisco Sour");
        drinks.add("Sprite");
        drinks.add("Old Fashion");
        drinks.add("Coke");

        Iterator<String> iterator = drinks.iterator();
        while (iterator.hasNext()) {
            String items = iterator.next();
            if (items.contains("a") || items.contains("e") || items.contains("A") || items.contains("E")) {
                System.out.print("Water, ");
            } else {
                System.out.print(items+", ");
            }

        }
    }
}

class Hw2c {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Boba Tea");
        drinks.add("Pepis");
        drinks.add("Pisco Sour");
        drinks.add("Sprite");
        drinks.add("Old Fashion");
        drinks.add("Coke");

        for(String x:drinks) {
            if (x.contains("a") || x.contains("e") || x.contains("A") || x.contains("E")) {
                System.out.print("Water, ");
            } else {
                System.out.print(x+", ");
            }
        }

    }
}