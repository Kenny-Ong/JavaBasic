package JavaClass.Class4;

import java.util.Scanner;

public class LoanSpecialist {

	public static void main(String[] args) {
		System.out.println("Is the loan less or equal to $200,000?");
		
		Scanner scanner = new Scanner(System.in);
		int loan=scanner.nextInt();
		
		
		if (loan<=200000) {
			System.out.println("Will  lend money");
		}
		else {
				System.out.println("Reject loan");
		}
	}		
}
