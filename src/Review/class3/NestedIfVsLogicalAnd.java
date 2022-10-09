public class NestedIfVsLogicalAnd {

	public static void main(String[] args) {
	
		boolean programmer=true;
		boolean manualTester=false;
		boolean knowFramework=true;
		
		if(programmer)
		{
			System.out.println("Yaay you are a programmer lets check if you know manual testing as well");
			if(manualTester) {
				
				if(knowFramework) {
					System.out.print("You can be an automation engineer");
				}
				
				else {
					System.out.println("You need to know a framework as well ");	
				}
				
				}
			else
			{
					System.out.println("You need to know Manual testing as well");	
				
			}
			
			
			}
		else 
		{
			System.out.println("You need to be a programmer as well");	
		}
		

	}

}
