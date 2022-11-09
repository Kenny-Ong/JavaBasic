package Practice;


public class practice3 {

    public static void main(String[] args) {
        EncapsulationDemo emp = new EncapsulationDemo("John", 30);
        System.out.println("Employee Name: "+emp.getempName("John"));
    }
}
class EncapsulationDemo{
    private String empName;
    private int empAge;

    public EncapsulationDemo(String name, int age) {
        setempAge(name);
        setempName(age);
    }
    void setempAge(String name){
    }
    int getempAge(int age){
        return age;
    }
    void setempName(int age) {
    }
    String getempName(String name) {
        return name;
    }
}