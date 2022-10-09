package JavaClass.Class13;

import java.util.Scanner;

public class Hw5 {

    public static void main(String[] args) {
        /*How would you check if String is
palindrome or not? aba=> true
Abbc =>false*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please type to see if your word is Palindrome: ");
        String word = input.next();
        StringBuilder rev = new StringBuilder(word).reverse();
        String str = rev.toString();

        if(str.equals(word)) {
            System.out.println(word+" is a palindrome");
        }
        else {
            System.out.println(word+" not a palindrome");
        }
    }
}