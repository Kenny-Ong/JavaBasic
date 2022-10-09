package JavaClass.Class4;

import java.util.Scanner;

public class MortgageRate {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the Mortgage rate?");
		
		double rates=scanner.nextDouble();
		
		if (rates>4.5) {
			System.out.println("Will not buy house");	
		}
		else {
			System.out.println("What is the House price?");
			int house=scanner.nextInt();

			if (house>200000 ) {
				System.out.println("Will take loan");
			}
			else {
				System.out.println("Pay cash");
			}
			
		}

	}

}
