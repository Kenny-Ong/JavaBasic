package JavaClass.Class7;

public class Hw4 {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)

		int num=21;
		
		while (num<=50) {
			System.out.print(num +" ");
			num+=2;
			
		}

		System.out.println("");
		
		int num2=20;
		
		while (num2<=50) {
			if (num2%2 == 1) {
				
				System.out.print(num2 + " ");
			}
			num2++;
		}
	}

}
