package JavaClass.Class4;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter your name");
		/*take a String type input form the keyboard and 
		 * stores it in a name variable
		 */
		String name=scanner.nextLine();
		System.out.println("Please Enter your age");
		//takes an int from the keyboard and stores it in age variable
		int age=scanner.nextInt();
		
		System.out.println("hi "+name+" your are "+age+" years old");
	}

}