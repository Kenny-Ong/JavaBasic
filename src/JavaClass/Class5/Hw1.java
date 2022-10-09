package JavaClass.Class5;

import java.util.Scanner;

public class Hw1 {

	/*
	 * 1. Write a program that will ask user to input inputs 
	 * the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night
*/
	public static void main(String[] args) {
		System.out.println("What is the current hour of the day?");
		Scanner input= new Scanner(System.in);
		
		int hr=input.nextInt();
		
		if (hr>=1 && hr<=11) {
			System.out.println("Morning");
		} else if (hr>=12 && hr<=15) {
			System.out.println("Afternoon");
		} else if (hr>=16 && hr<=20) {
			System.out.println("Evening");
		} else if (hr>=21 && hr<=24) {
			System.out.println("Night");
		} else {
			System.out.println("Invalid number");
		}
	}
}
