package JavaClass.Class6;

import java.util.Scanner;

public class Hw2 {
/* Allow user to enter grade (A, B, or C etc...) and then provide 
 * explanation: A-Excellent, B-Good, C-Average, D-Bad, any other 
 * grade --> Not Acceptable.  * At the end your program should 
 * print which grade was entered by a user with explanation.
 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter grade: ");
		char grade=input.next().charAt(0);
		String explanation;
		
		switch (grade) {
			case 'A':
				explanation="Excellent";
				break;
			case 'B':
				explanation="Good";
				break;
			case 'C':
				explanation="Average";
				break;
			case 'D':
				explanation="Bad";
				break;
			case 'F':
				explanation="Not Acceptable";
				break;
			default:
				explanation="Invalid Entry";
		}
	System.out.println("Your grade is "+ grade + " and is "+explanation);
	}

}
