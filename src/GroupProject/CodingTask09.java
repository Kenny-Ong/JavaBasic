package GroupProject;

public class CodingTask09 {

	public static void main(String[] args) {
		//  Maximum and minimum number in the array?

		int [] num = {3, 4, 22, 101, 53, 99};
		
		int max = 0;
		int min=0;
		
		for (int i = 0; i < num.length; i++) {
			if (max<num[i]) {
				max=num[i];
			}
		}
		
		for (int i = 0; i< num.length; i++) {
			if (num[0]>=num[i]) {
				min=num[i];
			}
		}
		System.out.println("Maximum number is "+max);
		System.out.println("Minimum number is "+min);
	}
}
