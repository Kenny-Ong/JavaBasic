package JavaClass.Class4;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		/*
		 * Scanner is a class that helps us take the input from the keyboard
		 * it  contains many different smaller modules called methods that can 
		 * help us take Strings, booleans and basically all types of data
		 * from the keyboard
		 */
		Scanner input= new Scanner(System.in); /*need to import java scanner file by 
		hovering over Scanner*/
		//A message will be displayed to the user on the console to enter his/her name
		System.out.println("please enter your name:");
		//Activates the java program to take the input from the keyboard and store it
		String name=input.next();
		//prints whatever name user enters on the keyboard on the console
		System.out.println("Hello "+name+" don't be confused");
		
	}

}