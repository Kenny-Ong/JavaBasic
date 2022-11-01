package JavaClass.Class20.Hw;

public class Hw4 {
/*Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method
with specific arguments and observe result.

 */
    private int addressNum;
    private String streetName;
    private String city;

    Hw4(){}
    Hw4 (int addressNum, String streetName, String city) {
        this.addressNum=addressNum;
        this.streetName=streetName;
        this.city=city;
    }
    private void addy(int addressNum) {
        System.out.println(addressNum);
    }
    private void addy(int addressNum, String streetName) {
        System.out.println(addressNum+" "+ streetName);
    }
    private void addy(int addressNum, String streetName, String city){
        System.out.println(addressNum+" "+ streetName+" "+city);
    }

    public static void main(String[] args) {
        Hw4 print = new Hw4();
        print.addy(123);
        print.addy(123, "Somewhere");
        print.addy(123, "Somewhere", "Nice");
    }
}

