package JavaClass.Class26.Hw;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hw5 {
/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;
 */
    public static void main(String[] args) {
        LinkedHashSet <String> cities = new LinkedHashSet<>();
        cities.add("Los Angeles");
        cities.add("Pasadena");
        cities.add("Long Beach");
        cities.add("Anaheim");
        cities.add("San Diego");
        cities.add("San Francisco");
        cities.add("Sacramento");

        Iterator <String> iterator = cities.iterator();

            while(iterator.hasNext()) {
                String item = iterator.next();
                if(item.startsWith("A")) {
                    iterator.remove();
                }
            }
        System.out.println(cities);
    }
}
