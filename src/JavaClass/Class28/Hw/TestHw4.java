package JavaClass.Class28.Hw;

import java.util.TreeMap;

public class TestHw4 {
    public static void main(String[] args) {
     /* Create a Person class with following private fields: name, lastName, age, salary.
    Variables should be initialized through constructor
    Inside the class as create a method to print user details
    In Test class create a Map that will store key in ascending order. In that map
    store personId and a Person Object. Print each object details
    */

        Person person1 = new Person("Kenny", "Ong", 39, 150000);
        Person person2 = new Person("Linda", "Huynh", 38, 200000);
        Person person3 = new Person("Ethan", "Ong", 5, 250000);
        Person person4 = new Person("Malia", "Ong", 3, 250000);

        TreeMap <Integer, Person> map = new TreeMap<>();
        map.put(1234, person1);
        map.put(4321, person2);
        map.put(5678, person3);
        map.put(8765, person4);

        var entrySet = map.entrySet();
        for(var entry:entrySet) {
            System.out.println(entry);
        }

    }
}
