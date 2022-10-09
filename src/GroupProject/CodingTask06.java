package GroupProject;

public class CodingTask06 {

	public static void main(String[] args) {
		/*Write a program to swap 2 numbers without a
temporary variable?*/
		
		int [] swap =  {2, 4};

	      for (int i = 0; i<swap.length; i++){
	        if (swap[0]==2) {
	          swap[0]=4;
	          swap[1]=2;
	          System.out.println(swap[0]);
	          System.out.println(swap[1]);
	        } 
	     }
	}
}
