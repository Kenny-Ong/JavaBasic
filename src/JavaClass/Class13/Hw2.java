package JavaClass.Class13;

public class Hw2 {

    public static void main(String[] args) {

        /*Create a String that should be combination
of letters, numbers and special characters.
Find out how many Alphanumeric
characters are there in the String.
         */

        String str = "Today is 12 Sunday!!!";
        String str1  = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(str1.length());

    }

}
