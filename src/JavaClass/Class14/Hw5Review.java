package JavaClass.Class14;

public class Hw5Review {

    public static void main(String[] args) {

        /*

         */



        String str = "dad";
        StringBuilder stringBuilder= new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)) {
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The String not Palindrome");
        }


    }
}
