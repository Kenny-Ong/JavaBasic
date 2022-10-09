package JavaClass.Class14;

public class Hw1Review {

    public static void main(String[] args) {

        /*reate a String that will hold a sentence. Write a program to get a new String without any spaces.*/

        String str = "we love Java";
        str = str.replaceAll(" ", "");
        System.out.println("str = " + str);

    }
}
