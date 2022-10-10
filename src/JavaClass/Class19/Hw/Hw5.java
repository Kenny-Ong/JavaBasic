package JavaClass.Class19.Hw;

public class Hw5 {

    /*Write program: Shape class has a constructor that takes the radius
    and has a subclass as  circle class. In circle class create a method
    to calculate the area of circle. Test your code
     */



}

class Shape {
    double radius;
    double pie = 3.14;

    public Shape(double radius) {
        this.radius=radius;
        this.pie=pie;
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        super(radius);
    }
    void areaCircle() {
        double area = (pie*(radius*radius));
        System.out.println("The area of the circle is "+area);

    }
    public static void main(String[] args) {
        Circle a = new Circle(3.2);
        a.areaCircle();

    }

}