package JavaClass.Class17.HomeWork;

public class StudentsHw2 {
    /*Write a java Class Students that have a constructor which takes students name and 3 subject grades. Inside your class
    also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks. Your
     program should print an average mark of each student name.
     NOTE: please use different names for instance and local variables.
     */

    private String name;
    private double gradeMath;
    private double gradeCoding;
    private double gradeEnglish;

    StudentsHw2(String Name, double Math, double Coding, double English ) {
        name=Name;
        gradeCoding=Coding;
        gradeEnglish=English;
        gradeMath=Math;
   }

    public void averageGrade() {
                System.out.println(name+" average grade is "+(gradeMath+gradeCoding+gradeEnglish)/3);
    }
}
