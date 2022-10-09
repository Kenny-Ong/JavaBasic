package JavaClass.Class9;

public class Hw1 {

	public static void main(String[] args) {
		/*
		 *  1. Create an array of cars and store 6 elements into it.
		 *  Using 2 different loops print all values from the array.
		 */

		String [] cars = {"Toyota", "Honda", "Ford", "General Motor", "KiA", "Tesla"};
		
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		
		System.out.println();
		
		for (String brand:cars) {
			System.out.print(brand + " ");
		}
		
	}

}
