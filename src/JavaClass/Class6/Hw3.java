package JavaClass.Class6;

import java.util.Scanner;

public class Hw3 {
	/*
	 * Using scanner class create calculator. Allow user to enter 2 numbers and
	 * operator(+,-,*,/). Based on operator provide the result to user. Please
	 * complete this assignment in 2 ways: using if statement and switch case.
	 */

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1=input.nextInt();
		System.out.println("Enter an Arithmetic operator: ");
		char op=input.next().charAt(0);
		System.out.println("Enter a second number: ");
		int num2=input.nextInt();
		int result;
		
		if (op=='+') {
			result=num1+num2;
			}else if (op=='-'){
				result=num1-num2;
			}else if (op=='*'){
				result=num1*num2;
			}else if(op=='/'){
				result=num1/num2;
			} else if(op=='%'){
				result=num1%num2;
			}
		else{
			System.out.println("invalid input");
			result=0;
		System.out.println(result);
		}
	}
}
