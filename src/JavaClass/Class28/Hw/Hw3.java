package JavaClass.Class28.Hw;

import java.util.HashMap;

public class Hw3 {
    public static void main(String[] args) {
        /*
        Create a map of Best Buy store. Place item id and item name into. Example (7664847= Printer,
        7879885-TV etc) Retrieve all keys and values form a Best Buy Map using EntrySet.
         */
        var bestBuyItem = new HashMap<>();
        bestBuyItem.put(7664847, "Printer");
        bestBuyItem.put(7879885, "TV");
        bestBuyItem.put(7663423, "Dishwasher");
        bestBuyItem.put(7614983, "Playstation 5");
        bestBuyItem.put(9382938, "Refrigerator");

        var entrySet = bestBuyItem.entrySet();
        entrySet.forEach(x-> System.out.println(x));
    }
}
