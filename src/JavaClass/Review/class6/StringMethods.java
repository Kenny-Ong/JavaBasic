package JavaClass.Review.class6;

public class StringMethods {

    public static void main(String[] args) {

        String str = "hello";

        //toUpperCase or toLowerCase
        str.toUpperCase();
        System.out.println(str); //hello

        System.out.println("---------------");
        str = str.toUpperCase();
        System.out.println(str); //HELLO

        //length(); ----> gives size
        int size = str.length();
        System.out.println(size);

        //charAt(); --> Returns teh char value at the specified index

        str.charAt(4); // index 4 of hello is 'o'
        char letter = str.charAt(4);
        System.out.println(letter);

        //how to get last Character

        char lastCharacter = str.charAt((str.length() - 1));
        System.out.println(lastCharacter);

        //indexOf()  return index # within this string of the first occurrence of the specified character
        int index = str.indexOf(lastCharacter);
        System.out.println(index);

        System.out.println(str.indexOf('a')); //returns -1 if it doesn't find the character from hello

        //isEmpty(); returns true if length is more than 0
        boolean empty = str.isEmpty();
        System.out.println(empty);

        //trim(); removes spaces beginning and end of the String


    }
}
