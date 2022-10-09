package JavaClass.Class14;

import java.util.Arrays;

public class StringRecap {

    public static void main(String[] args) {

        String str = "al;skfjlkj23jKDJlkjflaka3@K$";
        str = str.replaceAll("[^a-z]", "");
        System.out.println("str = " + str);

        String sentence = "Batch 14 is Great. Batch 14 is excellent";
        String[] split = sentence.split("[.?!]");
        System.out.println("split = " + Arrays.toString(split));


    }
}
