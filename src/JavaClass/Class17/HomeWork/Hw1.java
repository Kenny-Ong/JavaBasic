package JavaClass.Class17.HomeWork;

public class Hw1 {


    String brand;
    String color;
    Hw1(){}
    Hw1(String perBrand){
        brand=perBrand;
    }
    public void charge() {
        if (brand.equalsIgnoreCase("tesla")) {
            System.out.println("I can charge at home");
        } else {
            System.out.println("I have to pour gas");
        }
    }
}
