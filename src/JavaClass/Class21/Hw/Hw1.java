package JavaClass.Class21.Hw;

public class Hw1 {
    /*Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you
    need high school diploma"". Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
    In Masters class override method 'getPrerequisite'. Call the method by creating an object of
    each of the three classes.  */

    public static void main(String[] args) {
        Degree a = new Degree();
        Bachelors b = new Bachelors();
        Masters c = new Masters();

        a.getPrerequisite();
        b.getPrerequisite();
        c.getPrerequisite();
    }



}
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends Degree {

}

class Masters extends Degree {
        @Override
        void getPrerequisite() {
            System.out.println("To get a Master degree you need to get a high school diploma and Bachelor degree first");
        }
}
