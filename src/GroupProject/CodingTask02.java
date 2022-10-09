package GroupProject;

import java.util.Scanner;

public class CodingTask02 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */

		Scanner input = new Scanner(System.in);

		String countries[] = { "Japan", "Canada", "Vietnam", "Ireland", "France" };

		for (int i = 0; i < 5; i++) {
			System.out.println(
					"Type one of the list of 5 countries to find out their capital : Japan, Canada, Vietnam, Ireland, France");
			countries[i] = input.next();
			if (countries[i].equalsIgnoreCase("Japan")) {
				System.out.println(countries[i] + " capital is Tokyo.");
			} else if (countries[i].equalsIgnoreCase("Canada")) {
				System.out.println(countries[i] + " capital is Ottawa.");
			} else if (countries[i].equalsIgnoreCase("Vietnam")) {
				System.out.println(countries[i] + " capital is Hanoi.");
			} else if (countries[i].equalsIgnoreCase("Ireland")) {
				System.out.println(countries[i] + " capital is Dublin.");
			} else if (countries[i].equalsIgnoreCase("France")) {
				System.out.println(countries[i] + " capital is Paris.");
			} else {
				System.out.println("Please enter 1 of the 5 countries listed");
			}
		}
	}
}
