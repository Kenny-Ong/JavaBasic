package JavaClass.Class14;

import java.util.Scanner;

public class HwTask1 {
    /*Create a method that will take 2 parameters as a numbers and prints which number is larger.
*/
    Scanner input = new Scanner(System.in);

    void max(int num1, int num2) {

        int sum = 0;

        if (num1 > num2) {
            System.out.println(num1 + " is the larger number");
        } else if (num2>num1) {
            System.out.println(num2 + " is the larger number");
        } else {
            System.out.println("Numbers are equal");
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number");
        int num2 = input.nextInt();

        HwTask1 maxNum = new HwTask1();

        maxNum.max(num1, num2);



    }

}
