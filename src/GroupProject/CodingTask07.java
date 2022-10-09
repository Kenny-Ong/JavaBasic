package GroupProject;

import java.util.Scanner;

public class CodingTask07 {

	public static void main(String[] args) {
		/*Write a java program to check whether a given
		number is prime or not?*/

		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i ++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Please enter 5 numbers to see if it is a prime number: ");
				int prime = input.nextInt();
				
					if (prime%2==1 || prime==2) {
						System.out.println("The number "+prime+ " is a prime number");
					} else {
						System.out.println("The number "+prime+" is not a prime number");
					}
			}input.close();
		}
	}

}
