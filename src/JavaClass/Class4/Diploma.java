package JavaClass.Class4;

import java.util.Scanner;

public class Diploma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you have a diploma?");
		boolean diploma=scanner.nextBoolean();
			
			
		if (diploma) {
			System.out.println("Congratulations!!!");
			
			System.out.println("What is your GPA?");
			double gpa=scanner.nextDouble();
			
			if (gpa>3.5) {
				System.out.println("You are eligible for scholarhship");
			}
			else {
				System.out.println("You should have studied harder");
			}
		}
		else {
			System.out.println("Get a degree");
		}
	}
}
