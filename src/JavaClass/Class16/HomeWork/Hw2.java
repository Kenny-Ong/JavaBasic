package JavaClass.Class16.HomeWork;

public class Hw2 {


    /*Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public String revString(String a) {
        StringBuilder rev = new StringBuilder(a).reverse();
        String str = rev.toString();

        return str;
    }

    public static void main(String[] args) {
        Hw2 revWord = new Hw2();
        String str = revWord.revString("This is my reverse String");
        System.out.println(str);
    }
}