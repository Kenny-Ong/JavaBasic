package JavaClass.Class12;

public class Hw2 {

    public static void main(String[] args) {
        
        /*Create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.

Create a String and print it in reverse order (Sunday → yadnuS).

*/
        String  name="Malia";
        char half = '0';

        if (name.length()%2!=0 && name.length()>3) {
               half= (char) (name.length()/2);
            System.out.println(name.charAt(half));
        } else {
            System.out.println("String is even number of character");
        }
        //trim() - Returns a string whose value is this String with any whitespace removed


        //substring()
        String str="Hello Class";
        String part2 = str.substring(6); //Class
        System.out.println(part2);

        String part1=str.substring(0,5); //Hello
        System.out.println(part1);

        //concat
        String newString=part1.concat (part2);
        System.out.println(newString);

        // some examples

       char single = newString.substring(6).charAt(0);
        System.out.println(single);

        //newString.charAt(0).substring(6); CE

        //replace()

        String myString = "Today is September";
        myString.replace("September", "October");

        System.out.println(myString);

        myString=myString.replace('T', 't');
        System.out.println(myString);

        // splits();
        String myStr ="Today is a review class";
        String[] array=myStr.split(" ");
        System.out.println(array.length); //5
        System.out.println(array[3]); //review

        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        //other way
        for (String arr:array) {
            System.out.println(arr);
        }

    }

}
