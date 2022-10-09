package JavaClass.Class13;

public class StringMethodsReplace {

    public static void main(String[] args) {


        /*replace method based on the ascii table. "^" equals to not symbol in  .replaceAll();
        "," are not required in the [] to separate the conditions

        regexr.com cheatsheet
         */
        String str = "kskdfjKJKDJj34234#$*(*";
        System.out.println(str.replaceAll("[0-9]", "@"));
        System.out.println(str.replaceAll("[A-z]", "@"));
        System.out.println(str.replaceAll("[a-z]", ""));
        System.out.println(str.replaceAll("[0-5]", ""));
        System.out.println(str.replaceAll("[a-k]", ""));
        System.out.println(str.replaceAll("[0-z]", ""));
        System.out.println(str.replaceAll("[^A-Z]", ""));
        System.out.println(str.replaceAll("[^a-zA-Z]", ""));
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

    }
}
