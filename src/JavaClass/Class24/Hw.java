package JavaClass.Class24;

import org.openqa.selenium.interactions.SourceType;

import java.util.ArrayList;

public class Hw {
    //Create an ArrayList that will store 5 names into it.
    //Find out whether the given ArrayList is empty or not?
    //Check whether the specific name is present in an ArrayList or not?
    //Find the size of your arrayList and print all values from that
    public static void main(String[] args) {

        ArrayList <String> names = new ArrayList<>();
        names.add("Kenny");
        names.add("Linda");
        names.add("Ethan");
        names.add("Malia");
        names.add("Chloe");
        names.add("");

        System.out.println("================================================");


        for (String name:names) {
            if (name.isEmpty()) {
                System.out.println("Array is empty");
            } else {
                System.out.println("Array is not empty");
            }
        }
        System.out.println("================================================");


        if (names.contains("Asghar")) {
            System.out.println("Yes");
        }   else {
            System.out.println("No");
        }

        System.out.println("================================================");

        System.out.println(names.size());
    }
}
