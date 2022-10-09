package GroupProject;

public class CodingTask03 {

	public static void main(String[] args) {
		/* Create a 2D array of integer values. Print the sum of
		all numbers.*/
		
		int [][] num = {
				{2, 8, 9, 10},	
				{6, 4, 7, 5}
		};

		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {           
				sum+=num[i][j];
			}
			
		}
		System.out.println(sum);
	}

}
