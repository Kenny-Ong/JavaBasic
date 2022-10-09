package JavaClass.Class14;

public class HwTask7 {

/*   Create  class Student that will have a method getGrade. Your method should accept the score
of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F.*/

    char getGrade (int num) {
        char grade = 0;
        if (num >= 90 && num <= 100) {
            System.out.println("Grade is A");
        } else if (num >= 80 && num <= 89) {
            System.out.println("Grade is B");
        } else if (num >= 70 && num <= 79) {
            System.out.println("Grade is C");
        } else if (num >= 60 && num <= 69) {
            System.out.println("Grade is D");
        } else if (num >= 0 && num <= 59) {
            System.out.println("Grade is F");
        } else {
            System.out.println("Invalid input");
        }
        return grade;
    }

    public static void main(String[] args) {

        HwTask7 num = new HwTask7();
        System.out.println(num.getGrade(88));
        
    }

}
