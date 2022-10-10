package JavaClass.Class19.Hw;

public class Hw1 {

        /*
    Write program for multilevel inheritance
    where class C inherits from class B and Class B inherits from Class A.
     */
}
class A { //Person
    String name;
    String color;
    int height;
    int weight;
    String dateOfBirth;
    int socialSecurity;

    public A(String name, String color, int height, int weight, String dateOfBirth, int socialSecurity) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
        this.socialSecurity = socialSecurity;
    }
}

class B extends A{ //
    String education;
    String skills;

    public B(String name, String color, int height, int weight, String dateOfBirth, int socialSecurity, String education, String skills) {
        super(name, color, height, weight, dateOfBirth, socialSecurity);
        this.education = education;
        this.skills = skills;
    }
}

class C extends B{
    String job;

    public C(String name, String color, int height, int weight, String dateOfBirth, int socialSecurity, String education, String skills, String job) {
        super(name, color, height, weight, dateOfBirth, socialSecurity, education, skills);
        this.job = job;
    }
}
