package JavaClass.Class17.HomeWork;

public class Hw3 {
/*Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected) and
create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
and observe result.
 */

    String name;
    char gender;
    double height;
    double weight;

    public Hw3(String perName) {
        name=perName;
    }

    Hw3(String perName, char perGender) {
        name = perName;
        gender = perGender;
    }

   protected Hw3(String perName, char perGender, double perHeight){
            name=perName;
            gender=perGender;
            height =perHeight;
    }

   private Hw3(String perName, char perGender, double perHeight, double perWeight){
        name=perName;
        gender=perGender;
        height =perHeight;
        weight = perWeight;
    }



    public static void main(String[] args) {
        Hw3 obj1 = new Hw3("Kenny"); //public
        Hw3 obj2 = new Hw3("Malia", 'F'); //default
        Hw3 obj3 = new Hw3("Linda", 'F', 5.4); //protected
        Hw3 obj4 = new Hw3("Ethan", 'M', 5.6, 156); //private

        //All accessiable because constructor in this class
    }


}
