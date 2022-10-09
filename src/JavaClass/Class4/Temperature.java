package JavaClass.Class4;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("What city do you live in?");
		
		Scanner scanner = new Scanner(System.in);
				
		String city=scanner.nextLine();
		
		System.out.println("What is the temperature in Fahrenheit");
		double temp=scanner.nextDouble();
		
		temp=(temp-32)*5/9;
		System.out.println("The temperature of "+ city + " "+temp+"C");
	}

}
