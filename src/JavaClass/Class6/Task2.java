package JavaClass.Class6;

import java.util.Scanner;

public class Task2 {
	/*
	 * Write a program that will read three inputs of scores 
	 * (quiz, mid term, and final scores) and determine the grade based on the 
	 * following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
﻿
	 */
	public static void main(String[] args) {
	System.out.println("What is your quiz score?");
	Scanner input= new Scanner(System.in);	
	int quiz=input.nextInt();
	System.out.println("What is your mid term score?");
	int midterm=input.nextInt();
	System.out.println("What is your final score?");
	int Final=input.nextInt();
	int average=(quiz+midterm+Final)/3;
	String grade;
	
		if( average>=90 && average<= 100) {		
			grade="A";	
		} else if ( average>=80 && average<90) {	
			grade="B";	
		} else if ( average>=70 && average<80) {	
			grade="C";	
		} else if ( average>=65 && average<70) {	
			grade="D";
		} else if ( average>=0 && average<65) {		
			grade="F";
		} else { 
			System.out.println("Out of range");
			grade=null;
		}
	System.out.println("Your grade is "+grade);
	}
}


