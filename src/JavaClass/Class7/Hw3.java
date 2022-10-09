package JavaClass.Class7;

public class Hw3 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)

		int num=20;
		
		while (num>=2);
			System.out.print(num +" ");
			num-=2;
			
		System.out.println("");
		
		int num2=20;
		
		while (num2>=2);
			if (num2%2 == 0) {
				
				System.out.print(num2 + " ");
			}
			num2--;
		}	
	}
