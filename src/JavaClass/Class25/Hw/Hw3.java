package JavaClass.Class25.Hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Hw3 {
    /*values using 3 different ways.

    Create an arrayList of even numbers from 1 to 500.
    Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {
        ArrayList <Integer> numEven = new ArrayList<>();
        for(int i=2; i<=500; i+=2) {
            numEven.add(i);
        }
        for(int i=0; i<numEven.size(); i++) {
            if(numEven.get(i)%5==0) {
                numEven.remove(i);
            }
        }
        System.out.print(numEven+", ");

    }
}

class H3a {
    public static void main(String[] args) {
        ArrayList<Integer> numEven = new ArrayList<>();
        for (int i = 2; i <= 500; i += 2) {
            numEven.add(i);
        }
/*        Iterator<Integer> iterator = numEven.iterator();

        while (iterator.hasNext()) {
            Integer nums = iterator.next();
            if (nums % 5 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numEven+", ");*/

        numEven.removeIf(x->x%5==0);
        System.out.println(numEven);
    }

}

class Hw3b {
    public static void main(String[] args) {
        ArrayList<Integer> numEven = new ArrayList<>();
        for (int i = 2; i <= 500; i += 2) {
            numEven.add(i);
        }

        for(Integer x:numEven) {
            if (x% 5 == 0) {
            } else {
                System.out.print(x+", ");
            }
        }
    }
}