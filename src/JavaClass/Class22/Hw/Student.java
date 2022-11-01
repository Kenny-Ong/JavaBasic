package JavaClass.Class22.Hw;

public class Student {
        public void print () {
            System.out.println("Studying to have a better life");
        }
    }
class SyntaxStudent extends Student {
    String hobby;
    @Override
    public void print () {
        System.out.println("Studying coding");
    }
    public void coding(){
        System.out.println("Loves to code Java all day");
    }
}
class CollegeStudent extends Student {
    @Override
    public void print () {
        System.out.println("Going to a traditional higher education");
    }
    public void party(){
        System.out.println("Loves to party!");
    }
}
class SchoolStudent extends Student {
    @Override
    public void print () {
        System.out.println("Learning to become better");
    }
    public void study(){
        System.out.println("Study!!!");
    }
}
class tester {
    public static void main(String[] args) {
            SyntaxStudent a = new SyntaxStudent();
            CollegeStudent b = new CollegeStudent();
            SchoolStudent c = new SchoolStudent();
            a.print();
            b.print();
            c.print();
            a.coding();
            b.party();
            c.study();
            Student [] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
          for (Student print:students) {
              print.print();
              
          }
    }
}