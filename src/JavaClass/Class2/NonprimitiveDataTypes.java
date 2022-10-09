package JavaClass.Class2;

public class NonprimitiveDataTypes {

	public static void main(String[] args) {
		
		//String is just 1 example of non primitive data types
		
		String name="Kenny";
		
		String address="123 address street";
		
		String phone="(626) 123-4589";
				
		int age=39;
		//String age="17";//anything you put inside "" ->becomes a string
		
		String character="A";
		
		//ctr+space ->auto completes the statement
		
		System.out.println(name);
		
		//My name is Kenny
		
		System.out.println("My name is "+name);	
		
		//Kenny is 39
		System.out.println(name+" is "+age);
		
		String fruit="apple";
		double price=1.99;
		char symbol='$';
		char symbol2='¢';
		
		//The price of the apple is 1.99
		
		System.out.println("The price of the "+fruit+" is "+symbol+price+symbol2);
		
		fruit="mango";
		price=5.99;
		
		System.out.println("The price of the "+fruit+" is "+symbol+price+symbol2);
		
		/*to attach any value (int, double, boolean, char, String etc)
		 * to String we use +
		 * +next to the String acts as Concatenation
		 */
		
		
		
		
	}

}
