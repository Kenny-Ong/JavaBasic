package JavaClass.Class7;

public class WhileLoopTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a=50;
	
	while (a>=20) {
		System.out.print (a+ " ");
		a--;
	}
  
	System.out.println();
	
	int b=1;
	
	while (b<=20) {
		System.out.print(b + " ");
		b++;
	}
	
	System.out.println();
	//Print numbers from 100 to 1
	int c = 100;
	
	while (c>=1) {
		System.out.print(c + " ");
		c--;
	}
	
	System.out.println("");
	//Print even numbers from 20 to 100 
	int d = 20;
	
	while (d<=100) {
		if (d % 2 == 0) {
			System.out.print(d + " ");
		}
		d++;
	}
	
	System.out.println("");
	
	/*Print only odd numbers from 100 to 1
	*(2 different ways)
	*/
	
	int e = 100;
	
	while (e>=1) {
		if (e % 2 == 1) {
			System.out.print(e + " ");
		}
		 e--;
	}
	
	System.out.println("");
	
	int f = 99;
	
	while (f>=1) {
		if (f % 2 == 1) {
			System.out.print(f + " ");
		}
		f-=2;
	}	
	
}
}
