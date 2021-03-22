package JavaHomework;

import java.util.Scanner;

public class CreditCard {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Do you have a credit card? ");
		String creditCard=input.nextLine();
		if(creditCard.equals("Yes")) {
			System.out.println("What is the balance?");
			int balance=input.nextInt();
			if(balance>1000) {
				System.out.println("Pay off immediately!");
			}else {
				System.out.println("Spend more!");
			}
		}else {
			System.out.println("Would you like a credit card?");
		}
		
	}
}