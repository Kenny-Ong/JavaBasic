package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        String [] breeds = new String [10];
        breeds[0] = "BullDogs";
        System.out.println(Arrays.toString(breeds));
        ArrayList <String> color = new ArrayList<>();
        color.add("green");
        color.add("red");
        System.out.println(color.get(0));
        System.out.println(color.size());

        ArrayList <Boolean> truth = new ArrayList<>();
        truth.add(5>2);


        }
}
