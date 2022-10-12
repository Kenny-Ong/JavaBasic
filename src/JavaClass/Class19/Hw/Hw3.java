package JavaClass.Class19.Hw;

public class Hw3 {
    /*
    Write a Java program called Teacher.  Identify features
    and behaviour of that Class. Create 3 subclasses MathTeacher,
    ChemistryTeacher and PianoTeacher that would have it their own features
    and behaviour. Test all 4 classes
     */
    public static void main(String[] args) {
        MathTeacher t1 = new MathTeacher("John", 123, 'M', 39, "Algebra");
        t1.enjoyTeaching();
        t1.mathAddition(32, 54);
        ChemistryTeacher t2 = new ChemistryTeacher("Bob", 321, 'M', 27, "Organic Chemistry");
        t2.drugs();
        t2.enjoyTeaching();
        PianoTeacher t3 = new PianoTeacher("Linda", 432, 'F', 22, "Classical");
        t3.enjoyTeaching();
        t3.music();
    }


}


class Teacher{
    String name;
    int classRoom;
    char gender;
    int age;

    public Teacher(String name, int classRoom, char gender, int age) {
        this.name = name;
        this.classRoom = classRoom;
        this.gender = gender;
        this.age = age;
    }
    void enjoyTeaching() {
        System.out.println(name+" enjoys teaching");
    }
}

class MathTeacher extends Teacher{
        String mathType;
    public MathTeacher(String name, int classRoom, char gender, int age, String mathtype) {
        super(name, classRoom, gender, age);
        this.mathType =mathtype;
     }
     void mathAddition (int a, int b) {
         System.out.println(name+" knows how to add "+a+" + "+b+" = "+(a+b));
     }
}

class ChemistryTeacher extends Teacher{
        String chemistryType;
    public ChemistryTeacher(String name, int classRoom, char gender, int age, String chemistryType) {
        super(name, classRoom, gender, age);
        this.chemistryType=chemistryType;
    }

    void drugs() {
        System.out.println(name+" knows how to mix chemicals together like Walter White ;) ");
    }
}

class PianoTeacher extends Teacher{
        String pianoType;
    public PianoTeacher(String name, int classRoom, char gender, int age, String pianoType) {
        super(name, classRoom, gender, age);
        this.pianoType=pianoType;
    }
    void music () {
        System.out.println(name+" loves to play classical music");
    }
}