package JavaClass.Class4;

//Class Declaration
public class Dog {
 // Instance Variables
 String breed;
 String size;
 int age;
 String color;


 // method 1
 public String getInfo() {
     return ("Breed is: "+breed+" Size is: "+size+" Age is: "+age+" color is: "+color);
 }
 
 // method 2
 
 public String getInfo2() {
	 return ("Types of dog is: "+breed+" Size is: "+size+" Age is: "+age+" color is: "+color);
 }

 public static void main(String[] args) {
     Dog maltese = new Dog();
     maltese.breed="Maltese";
     maltese.size="Small";
     maltese.age=2;
     maltese.color="white";
     System.out.println(maltese.getInfo());
     

     Dog chowchow = new Dog();
     chowchow.breed="Chow Chow";
     chowchow.size="Midium";
     chowchow.age=3;
     chowchow.color="brown";
     System.out.println(chowchow.getInfo());

     Dog neapolitanmastiff = new Dog();
     neapolitanmastiff.breed="Neapolitan Mastiff";
     neapolitanmastiff.size="Large";
     neapolitanmastiff.age=2;
     neapolitanmastiff.color="Black";
     System.out.println(neapolitanmastiff.getInfo2());
     
     }
 }
