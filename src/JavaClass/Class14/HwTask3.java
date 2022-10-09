package JavaClass.Class14;

public class HwTask3 {

/*    Create a method that will print whether given String is palindrome or not.*/

    void palindrome (String word) {

        StringBuilder rev = new StringBuilder(word.toLowerCase()).reverse();
        String str = rev.toString();

        if(word.equals(str)) {
            System.out.println(word+" is Palindrome");
        } else {
            System.out.println(word+" is not Palindrome");
        }
    }

    public static void main(String[] args) {

        HwTask3 check = new HwTask3();

        check.palindrome("level");

    }

}
