package JavaClass.Class9;

import java.util.stream.IntStream;

public class Hw3 {

	public static void main(String[] args) {
		
/*3. Create an array on integers and calculate the sum of all elements in an array
 */
		
		int [] num = {3, 4, 12, 34, 5};
		
		int sum = IntStream.of(num).sum();
		System.out.println(sum);
		
		System.out.println("---------------------------------");
		
		System.out.println(num[0]+num[1]+num[2]+num[3]+num[4]);
		
		System.out.println("---------------------------------");
		
		int add=0;
		
		for (int i=0; i<num.length; i++) {
			add+=num[i];
		}
		System.out.println(add);
		System.out.println("---------------------------------");
		
		sum = 0;
		
		for (int numbs:num  ) {
			sum+=numbs;
			System.out.println(numbs);
		}
	}
}
