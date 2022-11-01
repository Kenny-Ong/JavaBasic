package JavaClass.Class20.Hw;

public class Hw1 {

    /*Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box

Use separate class to test your code

     */
    double width;
    double length;
    double side;
    double height;

    Hw1(){

    }
    Hw1 (double width, double length, double side, double height){
        this.width=width;
        this.length=length;
        this.side=side;
        this.height=height;
    }
    static void area(int width, double length){
        System.out.println("Area of Rectangle is "+(width*length));
    }
    static void area(int side){
        System.out.println("Area of Square is "+(side*side));
    }
   static void area(double length, double width, double height){
        System.out.println("Area of Box is "+(2*((length*width)+(length*height)+(width*height))));
    }

}


class AreaCalculator extends Hw1 {
    public static void main(String[] args) {
        area(3,5);
        area(8);
        area(12,14,15);
    }
}