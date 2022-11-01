package JavaClass.Class20.Hw;

public class Hw3 {

    /*Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method
    with specific arguments and observe result.
     */
String firstName;
String middleName;
String lastName;

    static void print(String firstName) {
    System.out.println(firstName);
}
    static void print(String firstName, String middleName) {
        System.out.println(firstName+" "+middleName);
    }
    static void print(String firstName, String middleName, String lastName) {
        System.out.println(firstName+" "+middleName+" "+lastName);
    }
}

class HwPrint extends Hw3{
    public static void main(String[] args) {
        print("Kenny");
        print("Kenny", "Duc");
        print("Kenny", "Duc", "Ong");
    }
}