package JavaClass.Class13;

public class Hw3 {

    public static void main(String[] args) {

        /*You have a String a=”Is it saturday? Is it
raining? Do we have a Java Class today?”
How would you find out how many
sentences are in that String?*/

        String str = "Is it Saturday? Is it raining? Do we have Java Class today?";
        String [] arr = str.split("[?]");
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            sum+=i;
        }
        System.out.println(sum);

        System.out.println(arr.length);

    }

}
