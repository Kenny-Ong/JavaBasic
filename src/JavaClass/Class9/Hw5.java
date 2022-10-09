package JavaClass.Class9;

public class Hw5 {

	public static void main(String[] args) {

/*5. Create an array to store char values and then print those in reverse order*/

		char [] letter = {'A','B', 'C','D','E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		for (int i=letter.length-1; i>=0; i--) {
			System.out.print(letter[i] + " ");
		}
	}

}
