package Review.class6;

public class Hw {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(("I want to reverse this sentence!!!"));
        System.out.println(sb.reverse());

        String rev = "I want to reverse this sentence!!!";
        String[] array = rev.split("");

        System.out.println("================================");

        for (int i = array.length - 1; 0 <= i; i--) {
            System.out.print(array[i]);
        }
        System.out.println("\n================================");

        char [] rev2 = rev.toCharArray();

        for (int i = rev2.length-1; 0 <= i; i--) {
            System.out.print(rev2[i]);
        }
            System.out.println("\n================================");

        String newString = "";

        for (int i=rev.length()-1; i>=0; i--) {
            newString = newString+rev.charAt(i);

        }
        System.out.println(newString);
    }
}
