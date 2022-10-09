package JavaClass.Class6;

import java.util.Scanner;

public class Hw1 {

	/*
	 * Ask user to enter their country and capture it. Once values are captured
	 * print which language user speaks.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Entery Country: ");
		String country = input.nextLine();
		String language;

		switch (country) {
		case "USA":
			language="English";
			break;
		case "Brazil":
			language="Portuguese";
			break;
		case "Canada":
			language="English";
		case "China":
			language="Mandarian Chinese";
			break;
		case "Czech Republic":
			language="Czech";
			break;
		case "Denmark":
			language="Danish";			
		case "Finland":
			language="Swedish";
			break;
		case "Iran":
			language="Persian";
			break;
		case "Japan":
			language="Japanese";
			break;
		default:
			language="null";
		}
	System.out.println("You are from "+country+" and speak "+language);
	}
}
