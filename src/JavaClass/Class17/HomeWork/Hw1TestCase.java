package JavaClass.Class17.HomeWork;

public class Hw1TestCase {

    public static void main(String[] args) {
        Hw1 car1 = new Hw1();
        car1.color= "Black";
        Hw1 car2 = new Hw1("Tesla");
        System.out.println(car2.brand);
        System.out.println(car1.color);
        car2.charge();
    }

}
