package JavaClass.Class8;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Print numbers from 1 to 50 except those divishble by 3
		 */
		
		int div3=3;
		for (int i = 50; i>1; i--) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
   }
}