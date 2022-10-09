package JavaClass.Class10;

public class Task1 {

	public static void main(String[] args) {
		
		String [][] names = new String [4][4];
		names [0][0] = "Mr";
		names [0][1] = "Mrs";
		names [0][2] = "Ms";
		names [0][3] = "Miss";
		names [1][0] = "Smith";
		names [1][1] = "Jordan";
		names [1][2] = "Jackson";
		names [1][3] = "Obama";
	
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);
		
		System.out.println("--------------------------");
		
		String [][] students = {
				{"Kenny", "Linda", "Ethan", "Maila"},
				{"A", "B", "C", "D"}
		};

		System.out.println(students[0][0]+" has a grade "+students[1][0]);
		System.out.println(students[0][1]+" has a grade "+students[1][1]);
		System.out.println(students[0][2]+" has a grade "+students[1][2]);
		System.out.println(students[0][3]+" has a grade "+students[1][3]);

	
	}
}
