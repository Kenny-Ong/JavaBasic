package JavaClass.Class4;

import java.util.Scanner;

public class InputFromKeyboard5 {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("Did you solve any Rep1 Assignment");
	boolean solvedAnyRepls=scanner.nextBoolean();
	
	if(solvedAnyRepls)
	{
		System.out.println("how many Repls you solved");
		int no0fReplsSolved=scanner.nextInt();
		
		if(no0fReplsSolved>=17){
			System.out.println("you are doing great");
		}else if(no0fReplsSolved>10) {
			System.out.println("you are doing ok Please compelte them as soon as possible");
		}else {
			System.out.println("You should solve some more repls");
		}
	}else{
		System.out.println("They are very important to learn java please solve them");
	}
}
}
