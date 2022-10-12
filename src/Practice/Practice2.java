package Practice;

public class Practice2 {

    public String alphabetical(String str) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] c = abc.toCharArray();
        char[] a = str.toCharArray();
        String b="";

        for (int i=0; i<a.length; i++){
            for (int j=0; j<c.length; i++) {
                if (a[i]==c[j]) {
                    for(int e=1; e<a.length; e++) {
                        for(int d=0; d<c.length; d++) {
                            if (a[e]==c[d]) {
                                if(i>e) {
                                    b+=a[i];
                                }
                            }
                        }
                    }
                }
            }
        }
        return b;
    }
    public static void main(String[]args) {

        Practice2 print = new Practice2();
        print.alphabetical("hello");
        print.alphabetical("software");
        print.alphabetical("language");


    }
}