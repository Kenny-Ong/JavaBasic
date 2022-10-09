package JavaClass.Class8;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		//  from the range of 1 to 50 please find the sum of all even and all odd numbers
	
		int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
        System.out.println("SUM OF EVEN NUMBERS = " + sumEven);
		
//----------------------------------------------------
	
		//create a secret number and let user guess the secret number
		//once the user guessed your secret number --> program says you won!
		
		Scanner input = new Scanner(System.in);
		
		double secret = 420;
		double user;
		
		do {
			System.out.println("Guess secret number");
			user=input.nextDouble();	
		} while (user!=420);
		
		System.out.println("You won!");
		
	}
}

