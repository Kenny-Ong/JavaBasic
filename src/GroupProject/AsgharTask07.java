package GroupProject;

import java.util.Scanner;

public class AsgharTask07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a number is to see if it is a prime number: ");
		int num = input.nextInt();
		boolean isPrime = true;
		if (num > 1) {

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		} else {
			isPrime = false;
		}

		if (isPrime) {
			System.out.println(num + " is Prime");
		} else {

			System.out.println(num + " is not Prime");
		}
	}
}
