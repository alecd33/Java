package JavaHw2;

import java.util.Scanner;

public class JHomework2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Enter a double: ");
		double num1=input.nextDouble();
		System.out.println("Enter a double: ");
		double num2=input.nextDouble();
		System.out.println("Enter a double: ");
		double num3=input.nextDouble();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+"is the largest number");
		} else if(num2>num1 && num2>num3) {
			System.out.println(num2+"is the largest number");

			
		} else if(num3>num1 && num3>num2) {
			System.out.println(num3+"is the largest number");
			
		}


		
	}
}
