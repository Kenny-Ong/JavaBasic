package JavaClass.Class4;

import java.util.Scanner;

public class WorkSalary {

	public static void main(String[] args) {
		System.out.println("Enter number of years worked: ");
		Scanner scanner= new Scanner(System.in);
		int work=scanner.nextInt();
		System.out.println("Enter annual salary: ");
		int salary=scanner.nextInt();
		
		if (work>=5) {
			System.out.println("Eligible for bonus");
			if(salary>50000) {
				System.out.println("bonus=$5000");
			}
			else {
				System.out.println("bonus=$3000");
			}
		}
		else {
			System.out.println("Not eligible for bonus");
		}

	}

}
