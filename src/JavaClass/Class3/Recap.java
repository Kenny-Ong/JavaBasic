package JavaClass.Class3;

public class Recap {

	public static void main(String[] args) {
		/*String concatentation helps us combine two Strings with any primitive data type together
		 * we can a
		 */
		
		String firstName="Mina";
		String lastName="Henen";
		String fullName=firstName+" "+lastName;
		System.out.println(fullName);
		
		int houseNo=10;
		int aprtmentNo=5;
		String streetName="Thats street";
		String city="New York";
		String country="USA";
		String fullAddress=aprtmentNo+" "+houseNo+" "+streetName+" "+city+" "+country;
		System.out.println(fullAddress);
		
		String incompleteAddress= houseNo+city;
		
		String step1="if we subtract 10 from 5 we get =" +10; //result in a String
		// its is not defined java does not understand what to do when we ask her
		//a String from sa number it complains
		//String step2=step1=5; 
		
		System.out.println("if we subtract 10 from 5 we get ="+(10-5));
		
	}
}
