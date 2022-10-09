package JavaClass.Class4;

import java.util.Scanner;

public class InputFromKeyboard2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter any sentence");
		String sentence=scanner.nextLine();
		System.out.println(sentence);
	}

}
