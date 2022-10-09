package JavaClass.Class14;

public class HwTask2 {

/*    Create a method that will take a number and prints whether the number is even or odd.*/

    void evenOdd (int num) {

        if( num%2==0) {
            System.out.println(num+" is even");
        } else  {
            System.out.println(num+" is odd");
        }

    }

    public static void main(String[] args) {

        HwTask2 evenOrOdd = new HwTask2();

        evenOrOdd.evenOdd(5);
    }

}
