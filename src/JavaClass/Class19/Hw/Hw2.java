package JavaClass.Class19.Hw;

public class Hw2 {

    /*
    Write program to inherit class A that has method printF
    which is static and call or reuse that method into class B
     */

}
class Hw2A{

    static void printF() {
        System.out.println("Write program to inherit class A that has method printF\n" +
                "which is static and call or reuse that method into class B");
    }

    }

class Hw2B extends Hw2A{

    public static void main(String[] args) {

        printF();


    }

}


