package JavaClass.Class17.HomeWork;

public class Hw3OutClass {
    public static void main(String[] args) {
        Hw3 obj1 = new Hw3("Kenny"); //public
        Hw3 obj2 = new Hw3("Malia", 'F'); //default
        Hw3 obj3 = new Hw3("Linda", 'F', 5.4); //protected
      /*  Hw3 obj4 = new Hw3("Ethan", 'M', 5.6, 154); //private*/
        //obj4 unavailable due to constructor is private
    }
}
