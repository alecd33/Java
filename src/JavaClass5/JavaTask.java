package JavaClass5;

import java.util.Scanner;

public class JavaTask {	
	public static void main(String[] args) {
	
	/*Prompt the user to enter person heights in inches. 
	 * Person should be classified as one of the following:
	short (under 60 inch)
	medium(between 60 -72 inch)
	tall (over 72 inch)*/
	System.out.println("\n-------Task 1------------\n");
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter height inches");
	int heightInches=input.nextInt();
	
	
	if(heightInches<60) {
		System.out.println("You are short");
	}else if(heightInches>=60 && heightInches<=72) {
		System.out.println("You are average height");
	}else if(heightInches>72) {
		System.out.println("You are tall\n");
	}
	
	
	/*
	 * Write a program that will print whether it is a weekend or weekday.
	 *  If any day from 1-5 → output “It is a weekday”, 
	 *  anyday from 6-7 → output “It is a weekend”, 
	 *  any other day → output “Invalid day”
	 */
	System.out.println("\n-------Task 2------------\n");
	
	System.out.println("Please enter the numbered day of the week: ");
	int day=input.nextInt();
	
	if(day>=1 && day<=5) {
		
		System.out.println("It is a weekday");
		
	}else if(day>=6 && day<=7) {
		System.out.println("it is a weekend");
	} else {
		System.out.println("Invalid day");
	}
	
	}

}
