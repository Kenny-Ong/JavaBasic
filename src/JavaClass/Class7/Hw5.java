package JavaClass.Class7;

import java.util.Scanner;

public class Hw5 {

	public static void main(String []args) {
		//Prompt the user to ask the name 3 times and print "Good afternoon +name...
		
		Scanner input = new Scanner(System.in);
		String name;
		int quest=1;
		
		while (quest<=3) {
			System.out.println("What is your name?");
			name=input.nextLine();
			quest++;
			System.out.println("Good after "+name);
		}
	}
}
