package JavaClass.Class26.Hw;


import java.util.ArrayList;
/*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
 as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own
 attribute as carModel and Class Pet has petType attribute.
 */
public class Hw1{
    public static void main(String[] args) {
        Car obj1 = new Car("Car Insurance", "Tesla");
        Pet obj2 = new Pet("Pet Insurance", "Bulldog");
        Health obj3 = new Health("Car Insurance");

        ArrayList <Insurance> arrayList = new ArrayList<>();
        arrayList.add(obj1);
        arrayList.add(obj2);
        arrayList.add(obj3);
        arrayList.add(new Car("Car Insurance", " Honda"));
        for (Insurance arr:arrayList){
            arr.getQuote();
            arr.cancelInsurance();
        }
    }
}

abstract class Insurance {
    String insuranceName;

    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();
}

class Car extends Insurance {

    String carModel;

    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("Getting "+insuranceName+" quote for "+carModel);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Canceling Car insurance for "+carModel);
    }

}
class Pet extends Insurance {
    String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
            System.out.println("Getting "+insuranceName+" quote for "+petType);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Canceling pet insurance for "+petType);
    }

}

class Health extends Insurance {

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
            System.out.println("Getting "+insuranceName+" quote");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel "+insuranceName);
    }

}