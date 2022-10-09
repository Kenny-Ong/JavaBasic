package JavaClass.Class11;

public class Phone {

    String make;
    String model;
    String color;
    int storage;
    double size;
    boolean cheap;

    void call() {

        System.out.println("calling ...");
    }

    void music() {
        System.out.println("Playing MUSIC");
    }
    void takePicture() {
        System.out.println("Taking pictures");
    }

    public static void main(String[] args) {
         // name of Class variable name = new Name of Class ();

        Phone iphone = new Phone();

        iphone.make="Apple";
        iphone.model="Iphone 14 Pro Max";
        iphone.color="Black";
        iphone.storage=128;
        iphone.size=6.8;
        iphone.cheap=false;
        System.out.print("Make "+iphone.make+" "); iphone.music();


        System.out.println("*******************");

        Phone samsungPhone=new Phone();
        samsungPhone.make="Samsung";
        samsungPhone.model="S22 Ultra";
        samsungPhone.color="Grey";
        samsungPhone.storage=256;
        samsungPhone.size=6.8;
        samsungPhone.cheap=false;

        System.out.print(samsungPhone.make+" "); samsungPhone.call();

        System.out.println("*******************");

        Phone pixel=new Phone();
        pixel.make="Google";
        pixel.model="Pixel 7 Pro";
        pixel.color="White";
        pixel.storage=256;
        pixel.size=6.4;
        pixel.cheap=false;

        System.out.print(pixel.model+" is "); pixel.takePicture();
    }

}
