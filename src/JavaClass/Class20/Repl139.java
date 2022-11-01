package JavaClass.Class20;

public class Repl139 {
    String alphabetical(String str) {
        char [] a =str.toCharArray();
        String b=str.substring(1).concat(" ");
        char [] c =b.toCharArray();
        String d="";
        for (int i=0; i<a.length; i++) {
            if(a[i]>c[i] && a[i]<c[i]) {
                System.out.print(a[i]);
                d += a[i];

            }
        }
        System.out.println(" ");
        return d;
    }
    public static void main(String[]args) {

        Repl139 print = new Repl139();
        print.alphabetical("hello");
        print.alphabetical("software");
        print.alphabetical("language");


    }
}