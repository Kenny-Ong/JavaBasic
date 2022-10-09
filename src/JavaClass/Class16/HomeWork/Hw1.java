package JavaClass.Class16.HomeWork;

public class Hw1 {
    /*Create a method that will accept an array as parameters and will return a sum of all
    elements from that array. Method should be visibly only within same package and
    accessible by the creating an instance of the class.
     */
    static int sumArray (int [] input) {
            int sum =0;
            for (int i =0; i<input.length; i++ ) {
                sum+=input[i];
            }
        return sum;
    }
    public static void main(String[] args) {
        int [] num = {3, 1,25, 23,5,3,78};
        System.out.println(sumArray(num));
    }
}