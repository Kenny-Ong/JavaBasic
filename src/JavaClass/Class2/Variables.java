package JavaClass.Class2;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname="Kenny";
		String lastname="Ong";
		String city="Temple City";
		String grade="A";
		String state="California";
		String phone="(626)123-4567";
		
		System.out.println("a)");
		System.out.println("My name is "+firstname+" my last name is "+lastname+".");
		System.out.println("I am "+grade+" student.");
		System.out.println("I live in "+city+", "+state+".");
		System.out.println("My phone number is"+phone+".");
		
		firstname="John";
		city="Los Angeles";
		phone="(626)321-7654";
		
		System.out.println(" ");
		System.out.println("b)");
		System.out.println("My name is "+firstname+" and I move to "+city+" and "+state+". My new phone number is "+phone+".");
		
		
		//Rules for Identifiers=names (variables, methods, 
		//1. cannot use keywords as identifiers
		//String new="Hello"; ->error
		//2 cannot have spaces in identifiers 
		//String last name="Smith";
		//3 identifiers cannot start with numbers
		//int 1number=123;->error
		
		/*4. identifiers cannot contain any special character
		 * exception for $ or _
		 */
		//boolean hello!=true; ->error
		
		double $price=9.98;
		float _price1=1.99F;
		
		/*
		 * Name Conventions
		 * 
		 * Class should start with Uppercase and follow with Camel casing
		 * 
		 * variables should start with lowercase and follow camel casing
		 */
		
		String Weather="hot"; //not preferred
		String myWeather="cold"; //preferred
		
		
		
	}

}
