package JavaClass.Class11;

public class Dog1 {

    String name;
    String color;
    String breed;
    double weight;
    int age;

    void run(){
        System.out.println("Running fast");
    }

    void eat () {
        System.out.println("Eatting kibbles...");
    }

    void bark() {
        System.out.println("WOOF!!!");
    }

    public static void main(String[] args) {

        Dog1 dog = new Dog1 ();
        dog.name="Chloe";
        dog.color="Black";
        dog.breed="Labrador";
        dog.weight=60;
        dog.age=7;

        System.out.print(dog.name+" is "); dog.eat();

        System.out.println("*********************************************");

        Dog1 dog3 = new Dog1 ();
        dog3.name="Bailey";
        dog3.color="Grey";
        dog3.breed="Husky";
        dog3.weight=65;
        dog3.age=3;

        System.out.print(dog3.name+" is  "); dog3.run();

        System.out.println("*********************************************");

        Dog1 dog2 = new Dog1 ();
        dog2.name="Riley";
        dog2.color="White";
        dog2.breed="Bulldog";
        dog2.weight=55;
        dog2.age=8;

        System.out.print(dog2.name+" is "); dog2.bark();

    }
}
