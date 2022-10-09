package JavaClass.Class8;

import javax.print.attribute.SetOfIntegerSyntax;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int hr1 = 0; hr1 <= 2; hr1++) {

			for (int hr2 = 0; hr2 <= 9; hr2++) {

				for (int min1 = 0; min1 <= 5; min1++) {

					for (int min2 = 0; min2 <= 9; min2++) {

						if (hr1 <= 1 || hr2 < 4) {
							System.out.println(hr1 + "" + hr2 + ":" + min1 + "" + min2);
						}
					}
				}
			}
		}

	}
}
