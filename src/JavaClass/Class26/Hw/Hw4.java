package JavaClass.Class26.Hw;


import java.util.TreeSet;

public class Hw4 {
/*
Create a Set collection in which you need to add names of the countries.
In this set we want all objects to be sorted in alphabetical order. Using 2
different ways retrieve all elements from set.
 */
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Nepal");
        countries.add("Mexico");
        countries.add("Brazil");
        countries.add("China");
        countries.add("Pakistan");
        countries.add("Qatar");
        countries.add("USA");
        countries.add("Oman");
        countries.add("Russia");
        countries.add("Denmark");
        countries.add("Spain");
        countries.add("Germany");
        countries.add("Turkey");
        countries.add("Hungary");
        countries.add("Ukraine");

        System.out.println(countries);
    }
}
