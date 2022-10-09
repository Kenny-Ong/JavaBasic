package JavaClass.Class16.HomeWork;

public class Hw3 {


   /* Create a method that will accept a String as a parameter and return a new String that consist
   only of vowels. Method should be available inside the class only where it was declared and
   executed by calling it is name.
    */
    private String vowel (String a) {
        StringBuilder aeiou = new StringBuilder(a.replaceAll("[^aeiouAEIOU]", ""));
        String onlyVowel = aeiou.toString();
        return onlyVowel;
    }

    public static void main(String[] args) {

        Hw3 letters = new Hw3();
        System.out.println(letters.vowel("This will only return vowels"));
    }
}
