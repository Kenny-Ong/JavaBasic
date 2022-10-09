package JavaClass.Class16;

public class Students {
    /*
     Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
     */
    String name;
    String id;
    static int numberOfStudent;

    public static void main(String[] args) {
        Students roman= new Students();
        roman.id="1";
        roman.name="Ivan";
        Students.numberOfStudent++;

        Students sonamKapor= new Students();
        sonamKapor.id="2";
        sonamKapor.name="Sonam";
        Students.numberOfStudent++;

        System.out.println(Students.numberOfStudent);
        System.out.println(Students.numberOfStudent);

    }
}