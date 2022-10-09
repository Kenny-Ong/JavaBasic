package JavaClass.Class6;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("Pleas enter birth month?");
		Scanner input= new Scanner(System.in);
		
		String month=input.nextLine();
		String season=null;
		
		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			season="Winter";
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			season="Spring";
		} else if (month.equalsIgnoreCase("June") ||month.equalsIgnoreCase("July") ||month.equalsIgnoreCase("August")) {
			season="Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("Novemeber")) {
			System.out.println("Autumn");
		} else {
			System.out.println("Wrong number is entered");
			season="invalid entery";
		}
		System.out.println("You were born is season "+season);
	}
}
