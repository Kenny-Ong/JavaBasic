package GroupProject;

import java.util.Scanner;

public class CodingTask01 {

	public static void main(String[] args) {
		/* Using Scanner create an array of integer values. After
		the array is created, calculate the sum of all stored
		elements in that array.
		*/

		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter 5 whole number values to get the sum of numbers: ");
		
		int [] num = new int[5];
		int sum=0;
		
		for (int i=0; i<num.length; i++) {
			num [i]= input.nextInt();
			sum+=num[i];
		}
		System.out.println(sum);
	}

}
