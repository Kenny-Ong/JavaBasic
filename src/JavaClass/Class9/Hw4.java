package JavaClass.Class9;

public class Hw4 {

	public static void main(String[]args) {
		/*4. From an array of integer elements find the largest number.
		 */
		int [] num = {2, 35, 44, 4};
		int largest = 0;
		
		for (int i=0; i<num.length; i++) {
			if (num[i]>largest) {
				largest=num[i];
			}
		}
		System.out.print(largest);
	}
}