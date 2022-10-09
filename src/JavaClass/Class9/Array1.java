package JavaClass.Class9;

public class Array1 {

	public static void main(String[] args) {
		
		String [] grades = {"A","B","C","D","E","F"};
		
		System.out.println(grades[1]);
	
		System.out.println("--------------------------");
		String [] grade = new String [6];
		
		grade[0] = "A";
		grade[1] = "B";
		grade[2] = "C";
		grade[3] = "D";
		grade[4] = "E";
		grade[5] = "F";
		
		System.out.println(grade[1]);
		
		System.out.println("--------------------------");
		
		String [] names = {"Kenny","Linda","Ethan","Malia","Chloe","Goldie"};
		
		System.out.println(names[1]);
	
		System.out.println("--------------------------");
		String [] names2 = new String [6];
		
		names2[0] = "Kenny";
		names2[1] = "Linda";
		names2[2] = "Ethan";
		names2[3] = "Malia";
		names2[4] = "Chloe";
		names2[5] = "Goldie";
		
		System.out.println(names2[1]);
		
		System.out.println("--------------------------");		
		
		String [] day = new String [5];
		
		day [0] = "Java";
		day [1] = "Saturday";
		day [2] = "day";
		day [3] = "coding";
		day [4] = "is";
		
		System.out.println(day[1]+" "+day[4]+" "+day[0]+" "+day[3]+" "+day[2]);
		
		System.out.println("--------------------------");	
	
		String [] day1 = {"Java", "Saturday", "day", "coding","is"};
		System.out.println(day1[1]+" "+day1[4]+" "+day1[0]+" "+day1[3]+" "+day1[2]);
		
		System.out.println("--------------------------");	
		
		
		// to print all value in array
		for (int i =0; i<day1.length; i++) {
			System.out.print(day1[i] + "  ");
		
			System.out.println("--------------------------");
			
			
			
	}
	}
}
