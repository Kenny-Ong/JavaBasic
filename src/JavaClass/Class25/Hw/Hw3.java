package JavaClass.Class25.Hw;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw3 {
    /*values using 3 different ways.

    Create an arrayList of even numbers from 1 to 500.
    Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        for(int i=2; i<=500; i+=2) {
            num.add(i);
        }
        for(int i=0; i<num.size(); i++) {
            if(num.get(i)%5==0) {
                num.remove(i);
            }
        }
        System.out.print(num+", ");
    }
}

class H3a {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 2; i <= 500; i += 2) {
            num.add(i);
        }
        Iterator<Integer> iterator = num.iterator();

        while (iterator.hasNext()) {
            Integer items = iterator.next();
            if (items % 5 == 0) {
            } else {
                System.out.print(items+", ");
            }
        }
    }
}

class Hw3b {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 2; i <= 500; i += 2) {
            num.add(i);
        }

        for(Integer x:num) {
            if (x% 5 == 0) {
            } else {
                System.out.print(x+", ");
            }
        }
    }
}