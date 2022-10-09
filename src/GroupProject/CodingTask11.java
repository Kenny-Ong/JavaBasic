package GroupProject;

public class CodingTask11 {

	/*
	 * Write a program to print out duplicate elements from an Array of Strings?
	 */

	public static void main(String[] args) {

		String[] doub = { "My", "I", "brain", "am", "a", "student", "at", "syntax", "technologies", "My", "brain", "is",
				"getting", "is", "fried", "from", "fried", "coding"};

		for (int i = 0; i < doub.length; i++) {
			for (int j = i + 1; j < doub.length; j++) {
				if (doub[i] == doub[j]) {
					System.out.print(doub[j] + " ");
				}
			}
		}
	}
}
