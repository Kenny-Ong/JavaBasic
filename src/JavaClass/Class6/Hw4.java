package JavaClass.Class6;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1=input.nextInt();
		System.out.println("Enter an Arithmetic operator: ");
		char op=input.next().charAt(0);
		System.out.println("Enter a second number: ");
		int num2=input.nextInt();
		int cal;
		
		switch (op) {
			case '+':
				cal=num1+num2;
				break;
			case '-':
				cal=num1-num2;
				break;
			case '*':
				cal=num1*num2;
				break;
			case '/':
				cal=num1/num2;
				break;
			case '%':
				cal=num1%num2;
			default:
				System.out.println("invalid input");
				cal=0;
		}	
		System.out.println(num1+" "+op+" "+num2+" = "+cal);
	}

}