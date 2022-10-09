package JavaClass.Class4;

public class NestedIfConditions {

	public static void main(String[] args) {
		
		int time=5;
		String day="Monday";
		 /*outer if conditions if it is true then only inner conditions will be checked if it false nothing from inner if conditions
		will be executed it is like the main door if main door is closed we can't enter building
		*/
		if(day.equals("Monday")) {                                  
			if(time>7) {                                             //inner if conditions
				System.out.println("lets go to office");
			}
			if (time<6) {
				System.out.println("Lets sleep more");
			}
		}
		
	}

}
