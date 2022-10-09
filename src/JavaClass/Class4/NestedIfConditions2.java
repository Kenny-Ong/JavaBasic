package JavaClass.Class4;

public class NestedIfConditions2 {

	public static void main(String[] args) {
		
		double moneyInMyAccount=2000;
		String season="Spring";
		
		if(season.equals("Spring")) 
		{
			if(moneyInMyAccount>3000) {
				System.out.println("let's go vaction");
			}
			else
			{
				System.out.println("I need to save more");
			}
		}
		

	}

}
