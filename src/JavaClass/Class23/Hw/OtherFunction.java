package JavaClass.Class23.Hw;

public interface OtherFunction{
    void edit();
    void close();
}
class JavaFile extends Hw1 implements OtherFunction{
    @Override
    void open() {
        System.out.println("Open JavaFile with NotePad");
    }
    @Override
    public void edit() {
        System.out.println("Edit JavaFile with NotePad");
    }
    @Override
    public void close() {
        System.out.println("Close JavaFile out of NotePad ");
    }
}
class WordFile extends Hw1 implements OtherFunction {
    @Override
    void open() {
        System.out.println("Open WordFile on MicrosoftWord");
    }
    @Override
    public void edit() {
        System.out.println("Edit WordFile");
    }
    @Override
    public void close() {
        System.out.println("Close WordFile out of MicrosoftWord");
    }
}
class PdfFile extends Hw1 implements OtherFunction{
    @Override
    void open() {
        System.out.println("Open PdfFile with Adobe");
    }
    @Override
    public void edit() {
        System.out.println("Edit PdfFile");
    }
    @Override
    public void close() {
        System.out.println("Close PdfFile out of Adobe");
    }
}

