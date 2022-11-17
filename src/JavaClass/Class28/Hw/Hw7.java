package JavaClass.Class28.Hw;

import java.util.ArrayList;

public class Hw7 {
    public static void main(String[] args) {
        /*Create a collection of integers in which you can keep duplicates. Write a logic to find
        sum of all integers
         */

        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(12);
        sum.add(34);
        sum.add(12);
        sum.add(644);
        sum.add(2);
        sum.add(34);
        sum.add(2452);
        int total=0;
        for(var x:sum) {
            total+=x;
        }
        System.out.println(total);
    }
}
