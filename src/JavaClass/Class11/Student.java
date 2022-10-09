package JavaClass.Class11;

public class Student {

    String name;
    String id;
    int age;
    double weight;
    char gender;

    void study (){
        System.out.print("Student is studying");
    }

    void deleteMessages() {
        System.out.println("Deleting messege from Discord");
    }

    void eat () {
        System.out.println("Eating pizza..");
    }

    public static void main(String[] args) {
        Student kenny = new Student ();

        kenny.name="Kenny";
        kenny.id="123";
        kenny.age=39;

        System.out.println(kenny.name);
        System.out.println(kenny.age);
        System.out.println(kenny.id);

        Student hubert = new Student ();

        hubert.name="Hubert";
        hubert.id="321";
        hubert.weight=170;
        hubert.gender='M';
        System.out.println(hubert.name);
        hubert.deleteMessages();


    }
}
