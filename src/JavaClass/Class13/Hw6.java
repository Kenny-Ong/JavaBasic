package JavaClass.Class13;

public class Hw6 {

    public static void main(String[] args) {

        String a = "first";
        String b = "second";

        a.replaceAll("first", "second");
        b.replaceAll("second", "first");

        System.out.println(a.replace(a, b));
        System.out.println(b.replace(b, a));

    }

}
