package GroupProject;

public class CodingTask10 {

	public static void main(String[] args) {
		/* Write a java program to find the second largest
number in the array?*/

		int [] num = {100, 3, 4, 22, 101, 53, 99};
		
		int max = 0;
		int secondMax = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (max<num[i]) {
				max=num[i];
			}
		}
		for (int i = 0; i< num.length; i++) {
			if (max!=num[i]) {
				if (secondMax<num[i]) {
					secondMax=num[i];
				}
			}
		}
		System.out.println("Max number is "+max);
		System.out.println("Second max number is "+secondMax);
	}

}
