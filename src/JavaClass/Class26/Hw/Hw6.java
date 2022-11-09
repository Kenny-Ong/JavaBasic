package JavaClass.Class26.Hw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hw6 {
    /*
    Create a Set collection that will hold Objects of Student Type. In this set we do not
    care about the insertion order. Each student object should have name and studentID.
    Display name of each student.
     */
    public static void main(String[] args) {
        var obj1 = new StudentType("Kenny", 1234);
        var obj2 = new StudentType("Linda", 5678);
        var obj3 = new StudentType("Ethan", 8765);
        var obj4 = new StudentType("Malia", 4321);
        var obj5 = new StudentType("Chloe", 9876);

        HashSet<StudentType> studentTypeHashSet = new HashSet<>();;

        studentTypeHashSet.add(obj1);
        studentTypeHashSet.add(obj2);
        studentTypeHashSet.add(obj3);
        studentTypeHashSet.add(obj4);
        studentTypeHashSet.add(obj5);


        for(StudentType hash:studentTypeHashSet) {
            hash.display();
        }

            HashMap<Integer, String> studentID = new HashMap<>();
            studentID.put(1234, "Kenny");
            studentID.put(5678, "Linda");
            studentID.put(8765, "Ethan");
            studentID.put(4321, "Malia");
            studentID.put(9876, "Chloe");

    }
}
class StudentType{
    String name;
    int studentId;
    StudentType (String name, int studentId) {
        this.name=name;
        this.studentId=studentId;
    }

    void display() {
        System.out.println(name);
    }
}
