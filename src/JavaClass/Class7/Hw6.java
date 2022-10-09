package JavaClass.Class7;

import java.util.Scanner;

public class Hw6 {

	public static void main(String[] args) {
		/*Declare a variable to store a price for a coffee. Ask the user to pay for a coffee. 
		 * Keep asking to pay for coffee until the user enters the EXACT amount . If the user gives 
		 * more than coffee price --> ask them to give less, if the user gives less money then ask 
		 * to give more. Once user give EXACT amount print “Please enjoy your coffee 
		 */

		Scanner input = new Scanner (System.in);
		
		double coffee=5.00;
		double answer;
			
		do {
		System.out.println("Please pay for the coffee");
		answer=input.nextDouble();
			if (answer>coffee) {
				System.out.println("give less");
			}
			else if (answer<coffee) {
				System.out.println("give more");
			}
		} while (answer!=coffee);
			
		System.out.println("Please enjoy your coffee");
		}

}
