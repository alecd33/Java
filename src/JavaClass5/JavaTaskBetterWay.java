package JavaClass5;

import java.util.Scanner;

public class JavaTaskBetterWay {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter height inches");
		int heightInches=input.nextInt();
		
		String definition="";
		
		if(heightInches<60) {
			definition="Short";
		}else if(heightInches>=60 && heightInches<=72) {
			definition="Medium";
		}else if(heightInches>72) {
			definition="Tall";
		}
		
		System.out.println("You are person who's height is "+definition);
	}
}
