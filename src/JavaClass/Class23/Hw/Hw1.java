package JavaClass.Class23.Hw;

public abstract class Hw1 implements OtherFunction{
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract. Create 3
    subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation
    of open behaviour: Example: to open .java file we need notepad++ or sublime text,
    to open .doc file we need Microsoft word to be installed etc
     */
    abstract void open();
}
class TestHw1 {
    public static void main(String[] args) {
        Hw1 [] all = {new JavaFile(), new WordFile(), new PdfFile()};
        for (Hw1 print : all) {
            print.open();
            print.edit();
            print.close();
        }
    }
}
