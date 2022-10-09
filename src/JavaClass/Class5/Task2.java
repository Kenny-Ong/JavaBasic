package JavaClass.Class5;

import java.util.Scanner;

public class Task2 {

	/*
	 * 2. Write a program that will print whether it is a weekend or weekday. 
	 * If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output 
	 * “It is a weekend”, any other day → output “Invalid day
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter number of day of week: ");
		Scanner input= new Scanner(System.in);
		
		int day=input.nextInt();
		
		if (day<=5){
			System.out.println("It is a weekday");
		} else if (day==6 || day==7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}
	}
}