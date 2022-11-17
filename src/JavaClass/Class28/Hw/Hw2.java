package JavaClass.Class28.Hw;

import org.apache.poi.poifs.filesystem.Entry;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Hw2 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        TreeMap <String, String> countries = new TreeMap<>();

        countries.put("Belarus", "Minsk");
        countries.put("Italy", "Rome");
        countries.put("Finland", "Helsinki");
        countries.put("Kenya", "Nairobi");
        countries.put("Peru", "Lima");
        countries.put("Mexico", "Mexico City");
        countries.put("Yemen", "Sana'a");
        countries.put("Taiwan", "Taipei");
        countries.put("United States", "Washington D.C.");
        countries.put("Zimbabwe", "Harare");
        countries.put("Austria", "Vienna");

        var entrySet = countries.entrySet();
        for(var country:entrySet) {
            System.out.println(country.getKey()+" = "+country.getValue());
        }
        System.out.println("-----------------------------------");
        Collection<String> countriesKey = countries.keySet();
        Collection<String> countriesValue = countries.values();
        Iterator<String> iteratorKey = countriesKey.iterator();
        Iterator<String> iteratorValue = countriesValue.iterator();

        while (iteratorValue.hasNext() && iteratorKey.hasNext()) {
            String key = iteratorKey.next();
            String value = iteratorValue.next();
            System.out.println(key+" = "+value);
        }
        System.out.println("-----------------------------------");

        var value=countries.values();

        for(var val:value) {
            System.out.print(val + ", ");
        }
        System.out.println();
        System.out.println("-----------------------------------");

        Iterator<String> it = countries.values().iterator();
        while(it.hasNext()) {
            String values = it.next();
            System.out.print(values+", ");
        }
    }
}
