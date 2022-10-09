package JavaClass.Class18;

public class Hw1 {

    /*Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables. Print name & address of
    given  student using displayInfo method.
     */

static class Student {

    String name;
    String address;

    public Student(String name, String address) {
        this.name=name;
        this.address=address;
    }

    void displayInfo() {
        System.out.println("Student name is "+name+" address "+address);
    }
}

    public static void main(String[] args) {
        Student kenny = new Student("Kenny","1234 Syntax Lane");
        kenny.displayInfo();
    }

}
