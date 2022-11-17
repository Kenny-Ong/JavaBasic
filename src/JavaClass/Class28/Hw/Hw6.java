package JavaClass.Class28.Hw;

import java.util.LinkedHashMap;

public class Hw6 {
    public static void main(String[] args) {
        /*
        Create the collection that will store single uniques Objects of a String type in which order
        is preserved.Write a logic to concatenate all string from the collection
         */

        LinkedHashMap <String, String>  orderCollection = new LinkedHashMap<>();
        orderCollection.put("Kenny", "is");
        orderCollection.put("going", "to");
        orderCollection.put("finish", "Syntax");
        orderCollection.put("Technologies", "with");
        orderCollection.put("an", "SDET");
        orderCollection.put("job", "by");
        orderCollection.put("April", "2023");

        var entrySet = orderCollection.entrySet();

        for (var concatenate:entrySet){
            System.out.print(concatenate.getKey()+" "+concatenate.getValue()+" ");
        }
    }
}
