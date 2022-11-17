package JavaClass.Class28.Hw;

import java.util.HashMap;

public class Hw1 {
    /*
    Create a map of ba building. Store floor number and it is associated Company name
    (Example: 1=Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    update Company on a 4th floor
    Remove company on the 7th floor
    print your map
     */
    public static void main(String[] args) {
        HashMap<Integer, String> buildingFloor = new HashMap<>();
        buildingFloor.put(1, "Google");
        buildingFloor.put(2, "Syntax");
        buildingFloor.put(1, "Google");
        buildingFloor.put(4, "Kenny LLC");
        buildingFloor.put(2, "Syntax");
        buildingFloor.put(1, "Google");
        buildingFloor.put(7, "Ashgar LLC");

        System.out.println("This is how many entries with duplicate "+buildingFloor.size());

        buildingFloor.replace(4, "Asel LLC");
        buildingFloor.remove(7);
        System.out.println(buildingFloor);


    }
}
