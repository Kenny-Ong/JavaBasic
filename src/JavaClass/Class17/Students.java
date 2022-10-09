package JavaClass.Class17;

public class Students {

    /*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
     Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different
     students with different marks. Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */

    String name;
    double math;
    double english;
    double bootCamp;

    Students(String perName, double perMath, double perEnglish, double perBootCamp) {
        perName=name;
        perMath=math;
        perEnglish=english;
        perBootCamp=bootCamp;
    }

    void averageGrade(double math, double english, double bootCamp) {
        double average =(math+english+bootCamp/3);
        System.out.println();
    }

}
