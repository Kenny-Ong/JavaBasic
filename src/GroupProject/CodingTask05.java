package GroupProject;

public class CodingTask05 {

	public static void main(String[] args) {
		/* Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.
*/
		int [][] num = {
				{1, 2, 3, 4, 5},	
				{6, 7, 8, 9, 10}
		};
		
		int sum = 0;
		
			for (int i = 0; i<num.length; i++) {
				for (int j = 0; j < num[0].length; j++) {
					if (num[i][j]%2==0) {
						sum+=num[i][j]; 
					}
				}
			}
			System.out.println("The sum of even numbers is: "+sum);
		int sum2 = 0;
			
			for (int i = 0; i<num.length; i++) {
				for (int j = 0; j < num[0].length; j++) {
					if (num[i][j]%2==1) {
						sum2+=num[i][j]; 
					}
				}
			}
			System.out.println("The sum of odd numbers is: "+sum2);		
	}

}
