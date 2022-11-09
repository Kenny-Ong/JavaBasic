package JavaClass.Class26.Hw;

import java.util.*;

public class Hw3 {
/*
How can you remove all duplicates from ArrayList?

List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
 */
    public static void main(String[] args) {

        ArrayList <String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

//        System.out.println(new LinkedHashSet<>(aList));
        LinkedHashSet <String> bList = new LinkedHashSet<>(aList);
        System.out.println(bList);
    }
}
