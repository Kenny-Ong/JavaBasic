package JavaClass.Class4;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		System.out.println("Do you have a credit card?");
		Scanner scanner = new Scanner(System.in);
		boolean credit=scanner.nextBoolean();
		
		if(credit==true) {
			System.out.println("What is the balance of the credit card?");
			int balance=scanner.nextInt();
			if(balance>1000) {
				System.out.println("Pay off immediately");
			}
			else {
				System.out.println("Spend more!!!");
			}
		}
		else {
			System.out.println("Do you want a credit card?");
		}
	}

}
